import time
import random
import os
from datetime import datetime
import sys
sys.path.append('/Users/bentan/finalYearProject/VITA/SCSV_Data_Configurations')
from simulator_config import createDirectoryIfNotExists, fileExists, writeHeaderToCsv, appendRowToCsv

DIRECTORY_PATH = '/Users/bentan/finalYearProject/VITA/2. Environmental'
CSV_FILE_NAME = 'Environmental_Sensor_Data.csv'
CSV_FILE_DIRECTORY = os.path.join(DIRECTORY_PATH, CSV_FILE_NAME)

def generateDataRow():
    """
    Generates a single row of data for the environmental sensor.
    Includes time, phase, sensor number, temperature, pressure, humidity, and gas.
    :return: single row of environmental data.
    """
    current_time = int(time.time())
    formatted_time = datetime.utcfromtimestamp(current_time).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 2
    sensor_number = 1
    temperature = round(random.uniform(20, 25), 2)
    pressure = round(random.uniform(0, 10), 2)
    humidity = round(random.uniform(0, 10), 2)
    gas = round(random.uniform(0, 10), 2)
    csv_data_row = [formatted_time, phase, sensor_number, temperature, pressure, humidity, gas]
    return csv_data_row

def main(number_of_rows):
    """
    Main function to generate and write a specified number of sensor data rows to a CSV file.
    :param number_of_rows: The number of data rows to generate and write.
    """
    headers = ["Time", "Phase", "Sensor Number", "Temperature", "Pressure", "Humidity", "Gas"]
    createDirectoryIfNotExists(DIRECTORY_PATH)
    if not fileExists(CSV_FILE_DIRECTORY):
        writeHeaderToCsv(CSV_FILE_DIRECTORY, headers)
    
    for _ in range(number_of_rows):
        csv_data_row = generateDataRow()
        appendRowToCsv(CSV_FILE_DIRECTORY, csv_data_row)
        time.sleep(1)

if __name__ == "__main__":
    number_of_rows = 10
    main(number_of_rows)
