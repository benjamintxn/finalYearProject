import csv
import time
import random
import os
import socket
import struct
from datetime import datetime

# Defining the path to the CSV file
directoryPath = '/Users/bentan/finalYearProject/VITA/3. Experiment'
csvFileSpectrometerData = 'Spectrometer_Data.csv'
csvFilePathSpectromerData = os.path.join(directoryPath, csvFileSpectrometerData)
csvFileTCSTemperatureData = 'TCS_Temperature_Data.csv'
csvFilePathSpectromerData = os.path.join(directoryPath, csvFileTCSTemperatureData)

# Ensure the directory exists
os.makedirs(directoryPath, exist_ok=True)

# Function to generate a single row of data
def generateDataRow():
    containerType = 2
    currentTime = int(time.time())
    formattedTime = datetime.utcfromtimestamp(currentTime).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 3  # Integer
    
    # Data for Spectrometer Data
    spectroNumber = 2  # Integer
    spectro415 = round(random.uniform(0, 1), 4)  # Float
    spectro480 = round(random.uniform(0, 1), 4)  # Float
    spectro555 = round(random.uniform(0, 1), 4)  # Float

    # For CSV: use formatted time
    csvSpectrometerData = [formattedTime, phase, spectroNumber, spectro415, spectro480, spectro555]
    # For packet: use integer time
    packetSpectrometerData = [containerType, currentTime, phase, spectroNumber, spectro415, spectro480, spectro555]

    return csvSpectrometerData, packetSpectrometerData

# Function to convert data row to binary and send as a packet
def sendPacket(dataRow):
    binaryData = b''
    # Convert each element to binary and concatenate
    for data in dataRow:
        if isinstance(data, int):  # For integers
            binaryData += struct.pack('>i', data)  # 4-byte integer
        elif isinstance(data, float):  # For floats
            binaryData += struct.pack('>f', data)  # 4-byte float

    # Send the binary data as a packet
    tmSocket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    tmSocket.sendto(binaryData, ('localhost', 10015))  # Adjust IP and port as needed

# Check if the file exists and write the header only if creating the file for the first time
if not os.path.exists(csvFilePathSpectromerData):
    with open(csvFilePathSpectromerData, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["Time", "Phase", "SpectroNumber", "415", "480", "555"])

# Generate data, append to CSV, and send as a packet
for _ in range(1):  # Adjust the range for the desired number of data rows
    csvSpectrometerData, packetSpectrometerData = generateDataRow()
    with open(csvFilePathSpectromerData, 'a', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(csvSpectrometerData)

    # Convert the packet data row to binary format and send as a packet
    sendPacket(packetSpectrometerData)
    time.sleep(1)  # Wait for 1 second between sending each packet
