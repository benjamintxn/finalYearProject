import time
import random
import socket
import os
from datetime import datetime
from simulatorUtils import createDirectoryIfNotExists, fileExists, writeHeaderToCsv, appendRowToCsv, convertDataRowToBinary, sendPacket

# Global variables for directory and file paths
DIRECTORY_PATH = '/Users/bentan/finalYearProject/VITA/3. Experiment'
CSV_FILE_NAME = 'Spectrometer_Data.csv'
CSV_FILE_PATH = os.path.join(DIRECTORY_PATH, CSV_FILE_NAME)
ADDRESS = ('localhost', 10017)  # Adjust as needed for your network setup

def generateDataRow():
    """Generate a single row of data for spectrometer."""
    currentTime = int(time.time())
    formattedTime = datetime.utcfromtimestamp(currentTime).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 2
    spectroNumber = 3
    spectro415 = round(random.uniform(0, 1), 2)
    spectro480 = round(random.uniform(0, 1), 2)
    spectro555 = round(random.uniform(0, 1), 2)
    csvDataRow = [formattedTime, phase, spectroNumber, spectro415, spectro480, spectro555]
    packetDataRow = [5, currentTime, phase, spectroNumber, spectro415, spectro480, spectro555]
    return csvDataRow, packetDataRow

def main():
    headers = ["Time", "Phase", "Spectrometer Number", "Spectrometer 415", "Spectrometer 480", "Spectrometer 555"]
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
