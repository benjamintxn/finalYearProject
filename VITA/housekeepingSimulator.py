import time
import random
import os
from datetime import datetime
from simulatorUtils import createDirectoryIfNotExists, fileExists, writeHeaderToCsv, appendRowToCsv

# Global variables for directory and file paths
DIRECTORY_PATH = '/Users/bentan/finalYearProject/VITA/1. Housekeeping'
CSV_FILE_NAME = 'PIV_Data.csv'
CSV_FILE_PATH = os.path.join(DIRECTORY_PATH, CSV_FILE_NAME)

def generateDataRow():
    """Generate a single row of data."""
    currentTime = int(time.time())
    formattedTime = datetime.utcfromtimestamp(currentTime).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    dataValues = [formattedTime, 1, 5, round(random.uniform(0, 100), 2), round(random.uniform(0, 10), 2), round(random.uniform(0, 15), 2)]
    csvDataRow  = dataValues
    return csvDataRow

def main(number_of_rows):
    headers = ["Time", "Phase", "V Line(V)", "P(W)", "I(A)", "V(V)"]
    createDirectoryIfNotExists(DIRECTORY_PATH)
    if not fileExists(CSV_FILE_PATH):
        writeHeaderToCsv(CSV_FILE_PATH, headers)
    
    for _ in range(number_of_rows):
        csvDataRow = generateDataRow()
        appendRowToCsv(CSV_FILE_PATH, csvDataRow)
        time.sleep(1)  # Sleep for 1 second before generating the next row

if __name__ == "__main__":
    number_of_rows = 100  # Set this to how many rows you want to generate
    main(number_of_rows)
