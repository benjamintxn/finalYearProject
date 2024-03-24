import time
import random
import os
from datetime import datetime
from simulatorUtils import createDirectoryIfNotExists, fileExists, writeHeaderToCsv, appendRowToCsv

# Global variables for directory and file paths
DIRECTORY_PATH = '/Users/bentan/finalYearProject/VITA/2. Environmental'
CSV_FILE_NAME = 'Environmental_Sensor_Data.csv'
CSV_FILE_PATH = os.path.join(DIRECTORY_PATH, CSV_FILE_NAME)

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
    return csvDataRow

def main(number_of_rows):
    headers = ["Time", "Phase", "Sensor Number", "Temperature", "Pressure", "Humidity", "Gas"]
    createDirectoryIfNotExists(DIRECTORY_PATH)
    if not fileExists(CSV_FILE_PATH):
        writeHeaderToCsv(CSV_FILE_PATH, headers)
    
    for _ in range(number_of_rows):
        csvDataRow = generateDataRow()
        appendRowToCsv(CSV_FILE_PATH, csvDataRow)
        time.sleep(1)  # Sleep for 1 second before generating the next row

if __name__ == "__main__":
    number_of_rows = 50  # Set this to how many rows you want to generate
    main(number_of_rows)
