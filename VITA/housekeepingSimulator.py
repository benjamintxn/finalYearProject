import csv
import time
import random
import os
import socket
import struct
from datetime import datetime

# Defining the path to the CSV file
directoryPath = '/Users/bentan/finalYearProject/VITA/1. Housekeeping'
csvFileName = 'PIV_Data.csv'
csvFilePath = os.path.join(directoryPath, csvFileName)

# Ensure the directory exists
os.makedirs(directoryPath, exist_ok=True)

# Function to generate a single row of data
def generateDataRow():
    containerType = 1
    currentTime = int(time.time())
    formattedTime = datetime.utcfromtimestamp(currentTime).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 1  # Integer
    vLine = 5  # Integer
    pW = round(random.uniform(0, 100), 2)  # Float
    iA = round(random.uniform(0, 10), 2)  # Float
    vV = round(random.uniform(0, 15), 2)  # Float

    # For CSV: use formatted time
    csvDataRow = [formattedTime, phase, vLine, pW, iA, vV]
    # For packet: use integer time
    packetDataRow = [containerType, currentTime, phase, vLine, pW, iA, vV]

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
    tmSocket.sendto(binaryData, ('localhost', 10015))  # Adjust IP and port as needed

# Check if the file exists and write the header only if creating the file for the first time
if not os.path.exists(csvFilePath):
    with open(csvFilePath, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["Time", "Phase", "V Line(V)", "P(W)", "I(A)", "V(V)"])

# Generate data, append to CSV, and send as a packet
for _ in range(1):  # Adjust the range for the desired number of data rows
    csvDataRow, packetDataRow = generateDataRow()
    with open(csvFilePath, 'a', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(csvDataRow)

    # Convert the packet data row to binary format and send as a packet
    sendPacket(packetDataRow)
    time.sleep(1)  # Wait for 1 second between sending each packet
