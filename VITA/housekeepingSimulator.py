import time
import random
import socket
import os
from datetime import datetime
from simulatorUtils import createDirectoryIfNotExists, fileExists, writeHeaderToCsv, appendRowToCsv, convertDataRowToBinary, sendPacket

# Global variables for directory and file paths
DIRECTORY_PATH = '/Users/bentan/finalYearProject/VITA/1. Housekeeping'
CSV_FILE_NAME = 'PIV_Data.csv'
CSV_FILE_PATH = os.path.join(DIRECTORY_PATH, CSV_FILE_NAME)
ADDRESS = ('localhost', 10015)  # Adjust as needed for your network setup

def generateDataRow():
    """Generate a single row of data."""
    currentTime = int(time.time())
    formattedTime = datetime.utcfromtimestamp(currentTime).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    csvDataRow = [formattedTime, 1, 5, round(random.uniform(0, 100), 2), round(random.uniform(0, 10), 2), round(random.uniform(0, 15), 2)]
    packetDataRow = [1, currentTime] + csvDataRow[1:]
    return csvDataRow, packetDataRow

def main():
    headers = ["Time", "Phase", "V Line(V)", "P(W)", "I(A)", "V(V)"]
    createDirectoryIfNotExists(DIRECTORY_PATH)
    if not fileExists(CSV_FILE_PATH):
        writeHeaderToCsv(CSV_FILE_PATH, headers)
    
    for _ in range(1):  # Adjust the range as needed
        csvDataRow, packetDataRow = generateDataRow()
        appendRowToCsv(CSV_FILE_PATH, csvDataRow)
        binaryData = convertDataRowToBinary(packetDataRow)
        sendPacket(binaryData, ADDRESS)
        time.sleep(1)  # Interval between sending packets

if __name__ == "__main__":
    main()
