import time
import random
import os
from datetime import datetime
from simulator_config import createDirectoryIfNotExists, fileExists, writeHeaderToCsv, appendRowToCsv

DIRECTORY_PATH = '/Users/bentan/finalYearProject/VITA/3. Experiment'
CSV_FILE_NAME = 'Spectrometer_Data.csv'
CSV_FILE_PATH = os.path.join(DIRECTORY_PATH, CSV_FILE_NAME)

def generateDataRow():
    """
    Generates a single row of data for the spectrometer experiment.
    Includes time, phase, spectrometer number, and spectrometer readings at different wavelengths.
    :return: single row of experiment data.
    """
    current_time = int(time.time())
    formatted_time = datetime.utcfromtimestamp(current_time).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 2
    spectro_number = 3
    spectro_415 = round(random.uniform(0, 1), 2)
    spectro_480 = round(random.uniform(0, 1), 2)
    spectro_555 = round(random.uniform(0, 1), 2)
    csv_data_row = [formatted_time, phase, spectro_number, spectro_415, spectro_480, spectro_555]
    return csv_data_row

def main(number_of_rows):
    """
    Main function to execute the data generation process.
    :param number_of_rows: The number of data rows to generate and write.
    """
    headers = ["Time", "Phase", "Spectrometer Number", "Spectrometer 415", "Spectrometer 480", "Spectrometer 555"]
    createDirectoryIfNotExists(DIRECTORY_PATH)
    if not fileExists(CSV_FILE_PATH):
        writeHeaderToCsv(CSV_FILE_PATH, headers)
    
    for _ in range(number_of_rows):
        csv_data_row = generateDataRow()
        appendRowToCsv(CSV_FILE_PATH, csv_data_row)
        time.sleep(1)

if __name__ == "__main__":
    number_of_rows = 10
    main(number_of_rows)
