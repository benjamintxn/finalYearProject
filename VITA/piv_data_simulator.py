import csv
import time
import random
import os
import socket
import struct
from datetime import datetime

# Defining the path to the CSV file
directory_path = '/Users/bentan/finalYearProject/VITA/1. Housekeeping'
csv_file_name = 'PIV_Data.csv'
csv_file_path = os.path.join(directory_path, csv_file_name)

# Ensure the directory exists
os.makedirs(directory_path, exist_ok=True)

# Function to generate a single row of data
def generate_data_row():
    current_time = int(time.time())
    formatted_time = datetime.utcfromtimestamp(current_time).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 1  # Integer
    v_line = 5  # Integer
    p_w = round(random.uniform(0, 100), 2)  # Float
    i_a = round(random.uniform(0, 10), 2)  # Float
    v_v = round(random.uniform(0, 15), 2)  # Float

    # For CSV: use formatted time
    csv_data_row = [formatted_time, phase, v_line, p_w, i_a, v_v]
    # For packet: use integer time
    packet_data_row = [current_time, phase, v_line, p_w, i_a, v_v]

    return csv_data_row, packet_data_row

# Function to convert data row to binary and send as a packet
def send_packet(data_row):
    binary_data = b''
    # Convert each element to binary and concatenate
    for data in data_row:
        if isinstance(data, int):  # For integers
            binary_data += struct.pack('>i', data)  # 4-byte integer
        elif isinstance(data, float):  # For floats
            binary_data += struct.pack('>f', data)  # 4-byte float

    # Send the binary data as a packet
    tm_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    tm_socket.sendto(binary_data, ('localhost', 10015))  # Adjust IP and port as needed

# Check if the file exists and write the header only if creating the file for the first time
if not os.path.exists(csv_file_path):
    with open(csv_file_path, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["Time", "Phase", "V Line(V)", "P(W)", "I(A)", "V(V)"])

# Generate data, append to CSV, and send as a packet
for _ in range(1):  # Adjust the range for the desired number of data rows
    csv_data_row, packet_data_row = generate_data_row()
    with open(csv_file_path, 'a', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(csv_data_row)

    # Convert the packet data row to binary format and send as a packet
    send_packet(packet_data_row)
    time.sleep(1)  # Wait for 1 second between sending each packet
