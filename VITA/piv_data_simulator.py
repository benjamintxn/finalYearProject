import csv
import time
import random
import os
from datetime import datetime
import binascii
import io
import socket
import sys
from struct import unpack_from
from threading import Thread
from time import sleep

#Defining the path to the PIV DATA CSV file
directory_path = '/home/bentan/Desktop/finalYearProject/VITA/1.Housekeeping'
csv_file_name = 'PIV_Data.csv'
csv_file_path = os.path.join(directory_path, csv_file_name)

#Ensure the directory exists
os.makedirs(directory_path, exist_ok=True)

#Function to generate single row of data
def generate_data_row():
    current_time = int(time.time()) #Unix epoch time 1707240346
    formatted_time = datetime.utcfromtimestamp(current_time).strftime('%Y-%m-%d %H:%M:%S (UTC)')
    phase = 1
    v_line = 5
    p_w = round(random.uniform(0, 100), 2)
    i_a = round(random.uniform(0, 10), 2)
    v_v = round(random.uniform(0, 15), 2)

    return [formatted_time, phase, v_line, p_w, i_a, v_v]

with open(csv_file_path, 'w', newline='') as csvfile:
    writer = csv.writer(csvfile)
    writer.writerow(["Time", "Phase", "V Line(V)", "P(W)", "I(A)", "V(V)"])

for _ in range (5):
    data_row = generate_data_row()
    with open(csv_file_path, 'a', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(data_row)
    time.sleep(1)
    
csv_file_path

#def send_csv_data(csv_path, yamcs_client):
    #with open(csv_path, 'r') as file:
        #csv_data = file.read()
        
    #yamcs_client.create_packet('csv_stream', csv_data)
    
#client = yamcs.Client('http://localhost:8090/')

#send_csv_data('/home/bentan/VITA/1.Housekeeping/PIV_Data.csv', client)

def send_tm(simulator):
    tm_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

    with io.open('/home/bentan/Desktop/finalYearProject/VITA/1.Housekeeping/PIV_Data.csv', 'rb') as f:
        simulator.tm_counter = 1
        header = bytearray(6)
        while f.readinto(header) == 6:
            (len,) = unpack_from('>H', header, 4)

            packet = bytearray(len + 7)
            f.seek(-6, io.SEEK_CUR)
            f.readinto(packet)

            tm_socket.sendto(packet, ('127.0.0.1', 10015))
            simulator.tm_counter += 1

            sleep(1)


def receive_tc(simulator):
    tc_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    tc_socket.bind(('127.0.0.1', 10025))
    while True:
        data, _ = tc_socket.recvfrom(4096)
        simulator.last_tc = data
        simulator.tc_counter += 1


class Simulator():

    def __init__(self):
        self.tm_counter = 0
        self.tc_counter = 0
        self.tm_thread = None
        self.tc_thread = None
        self.last_tc = None

    def start(self):
        self.tm_thread = Thread(target=send_tm, args=(self,))
        self.tm_thread.daemon = True
        self.tm_thread.start()
        self.tc_thread = Thread(target=receive_tc, args=(self,))
        self.tc_thread.daemon = True
        self.tc_thread.start()

    def print_status(self):
        cmdhex = None
        if self.last_tc:
            cmdhex = binascii.hexlify(self.last_tc).decode('ascii')
        return 'Sent: {} packets. Received: {} commands. Last command: {}'.format(
                         self.tm_counter, self.tc_counter, cmdhex)


if __name__ == '__main__':
    simulator = Simulator()
    simulator.start()

    try:
        prev_status = None
        while True:
            status = simulator.print_status()
            if status != prev_status:
                sys.stdout.write('\r')
                sys.stdout.write(status)
                sys.stdout.flush()
                prev_status = status
            sleep(0.5)
    except KeyboardInterrupt:
        sys.stdout.write('\n')
        sys.stdout.flush()



