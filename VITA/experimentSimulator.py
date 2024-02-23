import csv
import time
import random
import os
import socket
import struct
from datetime import datetime

# Defining the path to the CSV file
directoryPath = '/Users/bentan/finalYearProject/VITA/3. Experiment'
csvFileName = 'Spectrometer_Data.csv'
csvFilePath = os.path.join(directoryPath, csvFileName)

# Ensure the directory exists
os.makedirs(directoryPath, exist_ok=True)

# Function to generate a single row of data
def generateDataRow():
    containerType = 5
    currentTime = int(time.time())
    formattedTime = datetime.utcfromtimestamp(currentTime).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 2  # Integer
    spectroNumber = 3  # Integer
    spectro415 = round(random.uniform(0, 1), 2)  # Float
    spectro480 = round(random.uniform(0, 1), 2)  # Float
    spectro555 = round(random.uniform(0, 1), 2)  # Float

    # For CSV: use formatted time
    csvDataRow = [formattedTime, phase, spectroNumber, spectro415, spectro480, spectro555]
    # For packet: use integer time
    packetDataRow = [containerType, currentTime, phase, spectroNumber, spectro415, spectro480, spectro555]

    return csvDataRow, packetDataRow

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
    tmSocket.sendto(binaryData, ('localhost', 10017))  # Adjust IP and port as needed

# Check if the file exists and write the header only if creating the file for the first time
if not os.path.exists(csvFilePath):
    with open(csvFilePath, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["Time", "Phase", "Spectrometer Number", "Spectrometer 415", "Spectrometer 480", "Spectrometer 555"])

# Generate data, append to CSV, and send as a packet
for _ in range(1):  # Adjust the range for the desired number of data rows
    csvDataRow, packetDataRow = generateDataRow()
    with open(csvFilePath, 'a', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(csvDataRow)

    # Convert the packet data row to binary format and send as a packet
    sendPacket(packetDataRow)
    time.sleep(1)  # Wait for 1 second between sending each packet
