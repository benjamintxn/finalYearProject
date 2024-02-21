import csv
import time
import random
import os
from datetime import datetime
import socket
import struct

# Defining the path to the CSV file
directory_path = '/Users/bentan/finalYearProject/VITA/1.Housekeeping'
csv_file_name = 'PIV_Data.csv'
csv_file_path = os.path.join(directory_path, csv_file_name)

# Ensure the directory exists
os.makedirs(directory_path, exist_ok=True)

# Function to generate a single row of data
def generate_data_row():
    current_time = int(time.time())
    formatted_time = datetime.utcfromtimestamp(current_time).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 1  # Assuming 'Phase' is an integer
    v_line = 5  # Assuming 'VoltageLine' is an integer
    p_w = round(random.uniform(0, 100), 2)  # Assuming 'Power' is a float
    i_a = round(random.uniform(0, 10), 2)  # Assuming 'Current' is a float
    v_v = round(random.uniform(0, 15), 2)  # Assuming 'Voltage' is a float

    return [formatted_time, phase, v_line, p_w, i_a, v_v]

# Function to send a packet
def send_packet(data):
    tm_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    tm_socket.sendto(data.encode(), ('localhost', 10015))  # Adjust IP and port as needed

# Check if the file exists and write the header only if creating the file for the first time
if not os.path.exists(csv_file_path):
    with open(csv_file_path, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["Time", "Phase", "V Line(V)", "P(W)", "I(A)", "V(V)"])

# Generate data, append to CSV, and send as a packet
for _ in range(20):  # Adjust the range for the desired number of data rows
    data_row = generate_data_row()
    with open(csv_file_path, 'a', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(data_row)
        # Convert the data row to a string format suitable for sending and send as a packet
        packet_data = ','.join(map(str, data_row))
        send_packet(packet_data)
    time.sleep(1.5)  # Wait for 1 second between sending each packet
