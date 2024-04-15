import csv
import socket
import os
import struct
from datetime import datetime

def createDirectoryIfNotExists(path):
    """
    Creates the specified directory if it does not already exist.
    :param path: The path of the directory to be checked or created.
    """
    os.makedirs(path, exist_ok=True)

def fileExists(file_path):
    """
    Checks if a specified file exists.
    :param file_path: The path of the file to be checked.
    :return: True if the file exists, False otherwise.
    """
    return os.path.exists(file_path)

def writeHeaderToCsv(file_path, headers):
    """
    Writes the header row to a CSV file.
    :param file_path: The path of the CSV file.
    :param headers: A list containing the header names.
    """
    with open(file_path, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(headers)

def appendRowToCsv(file_path, row):
    """
    Appends a row of data to the CSV file.
    :param file_path: The path of the CSV file.
    :param row: A list containing the data for the new row.
    """
    with open(file_path, 'a', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(row)

def convertDataRowToBinary(data_row):
    """
    Converts a data row into a binary format suitable for packet sending.
    :param data_row: A list containing data of various types (int, float).
    :return: A binary representation of the data row.
    """
    binary_data = b''
    for data in data_row:
        if isinstance(data, int):
            binary_data += struct.pack('>i', data)
        elif isinstance(data, float):
            binary_data += struct.pack('>f', data)
    return binary_data

def sendPacket(binary_data, address):
    """
    Sends binary data as a packet to the specified address.
    :param binary_data: The binary data to be sent.
    :param address: A tuple containing the IP address and port number.
    """
    with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as tm_socket:
        tm_socket.sendto(binary_data, address)
