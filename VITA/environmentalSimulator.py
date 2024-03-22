import time
import random
import socket
import os
from datetime import datetime
from simulatorUtils import createDirectoryIfNotExists, fileExists, writeHeaderToCsv, appendRowToCsv, convertDataRowToBinary, sendPacket

# Global variables for directory and file paths
DIRECTORY_PATH = '/Users/bentan/finalYearProject/VITA/2. Environmental'
CSV_FILE_NAME = 'Environmental_Sensor_Data.csv'
CSV_FILE_PATH = os.path.join(DIRECTORY_PATH, CSV_FILE_NAME)
ADDRESS = ('localhost', 10016)  # Adjust as needed for your network setup

def generateDataRow():
    """Generate a single row of data for environmental sensor."""
    currentTime = int(time.time())
    formattedTime = datetime.utcfromtimestamp(currentTime).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 2
    sensorNumber = 1
    temperature = round(random.uniform(20, 25), 2)
    pressure = round(random.uniform(0, 10), 2)
    humidity = round(random.uniform(0, 10), 2)
    gas = round(random.uniform(0, 10), 2)
    csvDataRow = [formattedTime, phase, sensorNumber, temperature, pressure, humidity, gas]
    packetDataRow = [4, currentTime, phase, sensorNumber, temperature, pressure, humidity, gas]
    return csvDataRow, packetDataRow

def main():
    headers = ["Time", "Phase", "Sensor Number", "Temperature", "Pressure", "Humidity", "Gas"]
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
