import requests
import csv
import os
import base64
import time
import struct
from datetime import datetime, timezone, timedelta
from unpackFunctions import unpackingFunctions

# YAMCS API details and base output directory
YAMCS_INSTANCE = "VITA_BT_COMMS"
STREAM_NAME = "tm_realtime"
YAMCS_BASE_URL = "http://localhost:8090"
BASE_OUTPUT_DIRECTORY = "/Users/bentan/finalYearProject/client"

# Mapping of containerType values to their corresponding directories and CSV filenames
OUTPUT_PATHS = {
    1: {"directory": "1. Housekeeping", "csvFilename": "Output_PIV_Data.csv"},
    2: {"directory": "1. Housekeeping", "csvFilename": "Output_Software_Data.csv"},
    3: {"directory": "1. Housekeeping", "csvFilename": "Output_Storage_Data.csv"},
    4: {"directory": "2. Environmental", "csvFilename": "Output_Environmental_Sensor_Data.csv"},
    5: {"directory": "3. Experiment", "csvFilename": "Output_Spectrometer_Data.csv"},
    6: {"directory": "3. Experiment", "csvFilename": "Output_TCS_Temperature_Data.csv"},
}

# Initialize the last processed packet's generation time to the current UTC time
lastPacketTime = datetime.now(timezone.utc)

def fetchPacketsFromArchive(lastTime):
    """Fetch packets from the YAMCS archive starting from the specified lastTime."""
    formattedLastTime = lastTime.strftime('%Y-%m-%dT%H:%M:%S.%f')[:-3] + "Z"
    yamcsArchiveApiUrl = f"{YAMCS_BASE_URL}/api/archive/{YAMCS_INSTANCE}/packets?stream={STREAM_NAME}&start={formattedLastTime}"
    response = requests.get(yamcsArchiveApiUrl)
    if response.status_code == 200:
        return response.json().get('packet', [])
    else:
        print(f"Failed to fetch packets from YAMCS Archive: {response.status_code}")
        return []
        
def extractCsvRowFromPacket(packet):
    """Extract CSV row from packet data."""
    try:
        base64EncodedData = packet.get("packet")
        decodedData = base64.b64decode(base64EncodedData)
        containerType, currentTime, phase = struct.unpack('>iii', decodedData[:12])

        if containerType in unpackingFunctions:
            additionalData = unpackingFunctions[containerType](decodedData)
            csvRow = [currentTime, phase] + additionalData
        else:
            raise ValueError(f"Unknown containerType: {containerType}")

        # Convert the UNIX timestamp to a formatted string for CSV
        formattedTime = datetime.utcfromtimestamp(currentTime).strftime('%Y-%m-%d %H:%M:%S (UTC)')
        csvRow[0] = formattedTime  # Replace the UNIX timestamp with the formatted string

        return containerType, csvRow
    except Exception as e:
        print(f"Error processing packet: {e}")
        return None, None
        
def ensureDirectoryExists(path):
    """Ensure the specified directory exists."""
    os.makedirs(path, exist_ok=True)

def appendRowToCsv(filePath, row):
    """Append a row to the specified CSV file."""
    with open(filePath, 'a', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(row)

def processPackets():
    """Process packets fetched from YAMCS archive."""
    global lastPacketTime
    while True:
        packets = fetchPacketsFromArchive(lastPacketTime)
        for packet in packets:
            containerType, csvRow = extractCsvRowFromPacket(packet)
            if csvRow:
                pathInfo = OUTPUT_PATHS.get(containerType)
                if pathInfo:
                    directoryPath = os.path.join(BASE_OUTPUT_DIRECTORY, pathInfo['directory'])
                    ensureDirectoryExists(directoryPath)
                    csvFilePath = os.path.join(directoryPath, pathInfo['csvFilename'])
                    appendRowToCsv(csvFilePath, csvRow)
            packetTime = datetime.strptime(packet['generationTime'], '%Y-%m-%dT%H:%M:%S.%fZ').replace(tzinfo=timezone.utc)
            if packetTime > lastPacketTime:
                lastPacketTime = packetTime
        lastPacketTime += timedelta(milliseconds=1)
        time.sleep(1)

if __name__ == "__main__":
    processPackets()
