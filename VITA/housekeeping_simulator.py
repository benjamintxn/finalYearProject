import time
import random
import os
from datetime import datetime
from simulator_config import createDirectoryIfNotExists, fileExists, writeHeaderToCsv, appendRowToCsv

DIRECTORY_PATH = '/Users/bentan/finalYearProject/VITA/1. Housekeeping'
CSV_FILE_NAME = 'PIV_Data.csv'
CSV_FILE_PATH = os.path.join(DIRECTORY_PATH, CSV_FILE_NAME)

def generateDataRow():
    """
    Generates a single row of housekeeping data.
    Includes time, phase, voltage line, power, current, and voltage.
    :return: single row of housekeeping data.
    """
    current_time = int(time.time())
    formatted_time = datetime.utcfromtimestamp(current_time).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 1
    voltage_line = 5
    power = round(random.uniform(0, 100), 2)
    current = round(random.uniform(0, 10), 2)
    voltage = round(random.uniform(0, 15), 2)
    csv_data_row = [formatted_time, phase, voltage_line, power, current, voltage]
    return csv_data_row

def main(number_of_rows):
    """
    Main function to generate and write a specified number of housekeeping data rows to a CSV file.
    :param number_of_rows: Number of data rows to generate and append to the CSV.
    """
    headers = ["Time", "Phase", "V Line(V)", "P(W)", "I(A)", "V(V)"]
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