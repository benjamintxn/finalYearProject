import csv
import time
import random
import os
from datetime import datetime
import socket

# Defining the path to the PIV DATA CSV file
directory_path = '/Users/bentan/finalYearProject/VITA/1.Housekeeping'
csv_file_name = 'PIV_Data.csv'
csv_file_path = os.path.join(directory_path, csv_file_name)

# Ensure the directory exists
os.makedirs(directory_path, exist_ok=True)

# Function to generate single row of data
def generate_data_row():
    current_time = int(time.time())
    formatted_time = datetime.utcfromtimestamp(current_time).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 1
    v_line = 5
    p_w = round(random.uniform(0, 100), 2)
    i_a = round(random.uniform(0, 10), 2)
    v_v = round(random.uniform(0, 15), 2)

    return [formatted_time, phase, v_line, p_w, i_a, v_v]

# Function to send a packet
def send_packet(data):
    tm_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    tm_socket.sendto(data.encode(), ('localhost', 10015))  # Adjust IP and port as needed

# Write header to the CSV file
with open(csv_file_path, 'w', newline='') as csvfile:
    writer = csv.writer(csvfile)
    writer.writerow(["Time", "Phase", "V Line(V)", "P(W)", "I(A)", "V(V)"])

# Generate data, append to CSV, and send as a packet
for _ in range(2):  # Adjust the range for the desired number of data rows
    data_row = generate_data_row()
    with open(csv_file_path, 'a', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(data_row)
        # Convert the data row to a string format suitable for sending and send as a packet
        send_packet(','.join(map(str, data_row)))
    time.sleep(1)  # Wait for 1 second between sending each packet
