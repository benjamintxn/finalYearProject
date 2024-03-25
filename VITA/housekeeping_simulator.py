import time
import random
import os
from datetime import datetime
from simulator_config import createDirectoryIfNotExists, fileExists, writeHeaderToCsv, appendRowToCsv

# Global variables for directory and file paths
directory_path = '/Users/bentan/finalYearProject/VITA/1. Housekeeping'
csv_file_name = 'PIV_Data.csv'
csv_file_path = os.path.join(directory_path, csv_file_name)

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
    createDirectoryIfNotExists(directory_path)
    if not fileExists(csv_file_path):
        writeHeaderToCsv(csv_file_path, headers)
    
    for _ in range(number_of_rows):
        csv_data_row = generateDataRow()
        appendRowToCsv(csv_file_path, csv_data_row)
        time.sleep(1)

if __name__ == "__main__":
    number_of_rows = 10
    main(number_of_rows)
