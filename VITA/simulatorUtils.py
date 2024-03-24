import csv
import socket
import os
import struct
from datetime import datetime

def createDirectoryIfNotExists(path):
    """Ensure the directory exists."""
    os.makedirs(path, exist_ok=True)

def fileExists(file_path):
    """Check if a file exists."""
    return os.path.exists(file_path)

def writeHeaderToCsv(file_path, headers):
    """Write the header row to the CSV file."""
    with open(file_path, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(headers)

def appendRowToCsv(file_path, row):
    """Append a generated data row to the CSV file."""
    with open(file_path, 'a', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(row)

def convertDataRowToBinary(dataRow):
    """Convert a data row to binary format for packet sending."""
    binaryData = b''
    for data in dataRow:
        if isinstance(data, int):
            binaryData += struct.pack('>i', data)
        elif isinstance(data, float):
            binaryData += struct.pack('>f', data)
    return binaryData


def sendPacket(binaryData, address):
    """Send the binary data as a packet."""
    with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as tmSocket:
        tmSocket.sendto(binaryData, address)
