import os
import requests
import base64
import struct
import time
import csv
from datetime import datetime, timezone, timedelta

# YAMCS API details
yamcsInstance = "VITA_BT_COMMS"
streamName = "tm_realtime"
yamcsBaseUrl = "http://localhost:8090/api/archive"

# Base output directory for CSV files
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
        image_data_buffers[imageId] = {'total': totalPackets, 'received': 0, 'packets': [None] * totalPackets}

    image_buffer = image_data_buffers[imageId]
    if 0 <= packetSeq - 1 < totalPackets:
        if image_buffer['packets'][packetSeq - 1] is None:
            packetHexData = packet[16:].hex()
            if packetSeq == totalPackets:  # Last packet
                # Trim trailing zeros from the last packet's hex data
                packetHexData = packetHexData.rstrip('0')
            image_buffer['packets'][packetSeq - 1] = packetHexData
            image_buffer['received'] += 1
            print(f"Processed packet {packetSeq}/{totalPackets} for Image ID {imageId}")

        if image_buffer['received'] == totalPackets:
            # Combine hex data from all packets
            hexData = ''.join(p for p in image_buffer['packets'] if p is not None)
            saveHexDataToCSV(hexData, imageId)
            del image_data_buffers[imageId]
    else:
        print(f"Skipping packet with out-of-range sequence number: {packetSeq} for Image ID {imageId}")

def saveHexDataToCSV(hexData, imageId):
    csvFilePath = os.path.join(baseOutputDirectory, f"image_{imageId}.csv")
    
    with open(csvFilePath, 'w', newline='') as csvfile:
        csv_writer = csv.writer(csvfile)
        csv_writer.writerow(["HexData"])
        csv_writer.writerow([hexData])

    print(f"Hex data for image {imageId} saved to {csvFilePath}")

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
    time.sleep(1)
