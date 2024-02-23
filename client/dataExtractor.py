import requests
import csv
import os
import base64
import time
import struct
from datetime import datetime, timezone, timedelta

# YAMCS API details
yamcsInstance = "VITA_BT_COMMS"
streamName = "tm_realtime"
yamcsBaseUrl = "http://localhost:8090"

# Base output directory
baseOutputDirectory = "/Users/bentan/finalYearProject/client"

# Mapping of containerType values to their corresponding directories and CSV filenames
outputPaths = {
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
    # Convert lastPacketTime to the format expected by YAMCS API
    formattedLastTime = lastTime.strftime('%Y-%m-%dT%H:%M:%S.%f')[:-3] + "Z"
    
    # API endpoint for accessing packets from the archive, filtering by generation time
    yamcsArchiveApiUrl = f"{yamcsBaseUrl}/api/archive/{yamcsInstance}/packets?stream={streamName}&start={formattedLastTime}"

    response = requests.get(yamcsArchiveApiUrl)
    if response.status_code == 200:
        packets = response.json().get('packet', [])
        return packets
    else:
        print(f"Failed to fetch packets from YAMCS Archive: {response.status_code}")
        return []

def extractCSVRowFromPacket(packet):
    try:
        base64EncodedData = packet.get("packet")
        decodedData = base64.b64decode(base64EncodedData)

        # Unpack the containerType and the rest of the packet
        containerType, currentTime, phase = struct.unpack('>iii', decodedData[:12])

        # Based on containerType, process and unpack the rest of the data accordingly
        if containerType == 1:  # PIV Data
            vLine, pW, iA, vV = struct.unpack('>ifff', decodedData[12:])
            # Round the float values to 2 decimal places before adding to csvRow
            csvRow = [currentTime, phase, vLine, round(pW, 2), round(iA, 2), round(vV, 2)]
        elif containerType == 2:  # Software Data
            software, = struct.unpack('>f', decodedData[12:16])
            # Round the float value to 2 decimal places before adding to csvRow
            csvRow = [currentTime, phase, round(software, 2)]
        elif containerType == 3:  # Storage Data
            storage, = struct.unpack('>f', decodedData[12:16])
            # Round the float value to 2 decimal places before adding to csvRow
            csvRow = [currentTime, phase, round(storage, 2)]
        elif containerType == 4:  # Environmental Sensor Data
            sensorNumber, temperature, pressure, humidity, gas = struct.unpack('>iffff', decodedData[12:])
            # Round the float value to 2 decimal places before adding to csvRow
            csvRow = [currentTime, phase, sensorNumber, round(temperature, 2), round(pressure,2), round(humidity, 2), round(gas, 2)]
        elif containerType == 5:  # Spectrometer Data
            spectroNumber, spectro415, spectro480, spectro555 = struct.unpack('>ifff', decodedData[12:])
            # Round the float value to 2 decimal places before adding to csvRow
            csvRow = [currentTime, phase, spectroNumber, round(spectro415, 2), round(spectro480, 2), round(spectro555, 2)]
        elif containerType == 6:  # TCS Temperature Data
            temperature1, temperature2, temperature3, temperature4 = struct.unpack('>ffff', decodedData[12:])
            # Round the float value to 2 decimal places before adding to csvRow
            csvRow = [currentTime, phase, round(temperature1, 2), round(temperature2, 2), round(temperature3, 2), round(temperature4, 2)]

        # Convert the UNIX timestamp to a formatted string for CSV
        formattedTime = datetime.utcfromtimestamp(currentTime).strftime('%Y-%m-%d %H:%M:%S (UTC)')
        csvRow[0] = formattedTime  # Replace the UNIX timestamp with the formatted string

        return containerType, csvRow
    except Exception as e:
        print(f"Error processing packet: {e}")
        return None, None


while True:
    packets = fetchPacketsFromArchive(lastPacketTime)

    for packet in packets:
        containerType, csvRow = extractCSVRowFromPacket(packet)
        if csvRow:
            pathInfo = outputPaths.get(containerType)
            if pathInfo:
                # Ensure the directory for this containerType exists
                directoryPath = os.path.join(baseOutputDirectory, pathInfo['directory'])
                os.makedirs(directoryPath, exist_ok=True)

                # Construct the full path to the CSV file
                csvFilePath = os.path.join(directoryPath, pathInfo['csvFilename'])

                # Now you can safely open the file and write the row
                with open(csvFilePath, 'a', newline='') as csvfile:
                    writer = csv.writer(csvfile)
                    writer.writerow(csvRow)

            # Update lastPacketTime to the generation time of the current packet
            packetTime = datetime.strptime(packet['generationTime'], '%Y-%m-%dT%H:%M:%S.%fZ').replace(tzinfo=timezone.utc)
            if packetTime > lastPacketTime:
                lastPacketTime = packetTime

    lastPacketTime += timedelta(milliseconds=1)
    time.sleep(1)
