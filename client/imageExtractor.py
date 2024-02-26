import os
import requests
import base64
import struct
import time
from datetime import datetime, timezone, timedelta
from PIL import Image
import io

# YAMCS API details
yamcsInstance = "VITA_BT_COMMS"
streamName = "tm_realtime"
yamcsBaseUrl = "http://localhost:8090/api/archive"

# Base output directory for images
baseOutputDirectory = "/Users/bentan/finalYearProject/client/4. Images"

# Ensure the output directory exists
os.makedirs(baseOutputDirectory, exist_ok=True)

# Initialize the last processed packet's generation time to the current UTC time
lastPacketTime = datetime.now(timezone.utc)

def fetchPacketsFromArchive(lastTime):
    formattedLastTime = lastTime.strftime('%Y-%m-%dT%H:%M:%S.%f')[:-3] + "Z"
    yamcsArchiveApiUrl = f"{yamcsBaseUrl}/{yamcsInstance}/packets?stream={streamName}&start={formattedLastTime}"
    response = requests.get(yamcsArchiveApiUrl)
    if response.status_code == 200:
        return response.json().get('packet', [])
    else:
        print(f"Failed to fetch packets: HTTP {response.status_code}")
        return []

image_data_buffers = {}

def processImagePacket(packet):
    containerType, totalPackets, imageId, packetSeq = struct.unpack('>IIII', packet[:16])

    if containerType != 7:  # Skip non-image packets
        return

    if imageId not in image_data_buffers:
        image_data_buffers[imageId] = {'total': totalPackets, 'packets': [None] * totalPackets}

    buffer = image_data_buffers[imageId]
    if 0 <= packetSeq - 1 < totalPackets:
        if not buffer['packets'][packetSeq - 1]:
            buffer['packets'][packetSeq - 1] = packet[16:]
            print(f"Processed packet {packetSeq}/{totalPackets} for Image ID {imageId}")
            if all(buffer['packets']):  # Check if all packets have been received
                saveImageData(buffer['packets'], imageId)
                print(f"Done processing Image ID {imageId}. Saved to {os.path.join(baseOutputDirectory, f'image_{imageId}.jpg')}")
                del image_data_buffers[imageId]
    else:
        print(f"Skipping packet with out-of-range sequence number: {packetSeq} for Image ID {imageId}")

def saveImageData(imageData, imageId):
    imagePath = os.path.join(baseOutputDirectory, f"image_{imageId}.jpg")
    with open(imagePath, 'wb') as file:
        for packet in imageData:
            if packet:  # Ensure the packet is not None
                file.write(packet)
    print(f"Image {imageId} saved to {imagePath}")

print("Listening for new packets...")

while True:
    packets = fetchPacketsFromArchive(lastPacketTime)
    new_lastPacketTime = lastPacketTime

    for packet_info in packets:
        generationTime = datetime.strptime(packet_info['generationTime'], '%Y-%m-%dT%H:%M:%S.%fZ').replace(tzinfo=timezone.utc)
        if generationTime > new_lastPacketTime:
            new_lastPacketTime = generationTime

        packetData = base64.b64decode(packet_info.get("packet"))
        processImagePacket(packetData)

    lastPacketTime = new_lastPacketTime + timedelta(milliseconds=1)
    time.sleep(1)  # Adjust sleep time as needed
