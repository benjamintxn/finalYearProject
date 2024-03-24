import time
import random
import os
from datetime import datetime
from simulatorUtils import createDirectoryIfNotExists, fileExists, writeHeaderToCsv, appendRowToCsv

# Global variables for directory and file paths
DIRECTORY_PATH = '/Users/bentan/finalYearProject/VITA/3. Experiment'
CSV_FILE_NAME = 'Spectrometer_Data.csv'
CSV_FILE_PATH = os.path.join(DIRECTORY_PATH, CSV_FILE_NAME)

def generateDataRow():
    """Generate a single row of data for the spectrometer."""
    currentTime = int(time.time())
    formattedTime = datetime.utcfromtimestamp(currentTime).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 2
    spectroNumber = 3
    spectro415 = round(random.uniform(0, 1), 2)
    spectro480 = round(random.uniform(0, 1), 2)
    spectro555 = round(random.uniform(0, 1), 2)
    csvDataRow = [formattedTime, phase, spectroNumber, spectro415, spectro480, spectro555]
    return csvDataRow

def main(number_of_rows):
    headers = ["Time", "Phase", "Spectrometer Number", "Spectrometer 415", "Spectrometer 480", "Spectrometer 555"]
    createDirectoryIfNotExists(DIRECTORY_PATH)
    if not fileExists(CSV_FILE_PATH):
        writeHeaderToCsv(CSV_FILE_PATH, headers)
    
    for _ in range(number_of_rows):
        csvDataRow = generateDataRow()
        appendRowToCsv(CSV_FILE_PATH, csvDataRow)
        time.sleep(1)  # Sleep for 1 second before generating the next row

if __name__ == "__main__":
    number_of_rows = 100  # Example: Set this to how many rows you want to generate
    main(number_of_rows)
