import csv
import os
import socket
import io
import time
import struct
from PIL import Image
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler

# Global counter for image ID generation
image_id_counter = 1

# Configuration
watch_directory = '/Users/bentan/finalYearProject/VITA/4. Images'
csv_directory_path = '/Users/bentan/finalYearProject/VITA/4. Images'
csv_file_name = 'Images.csv'
csv_file_path = os.path.join(csv_directory_path, csv_file_name)

# Ensure the directory exists
os.makedirs(csv_directory_path, exist_ok=True)

def image_to_hex(image_path, output_format='JPEG', quality=100):
    with Image.open(image_path) as img:
        img_byte_arr = io.BytesIO()
        img.save(img_byte_arr, format=output_format, quality=quality)
        img_byte_arr.seek(0)
        hex_data = img_byte_arr.getvalue().hex()
        return hex_data

def append_hex_to_csv(hex_data, csv_path):
    with open(csv_path, 'a', newline='') as csvfile:
        csv_writer = csv.writer(csvfile)
        csv_writer.writerow([hex_data])

def send_packet(hex_data, host='localhost', port=10018, packet_size=1400):
    global image_id_counter

    udp_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    total_data_bytes = len(hex_data) // 2
    header_format = '>IIII'  # Add another 'I' for the sequence number
    container_type = 7

    header_size = struct.calcsize(header_format)
    max_payload_size = packet_size - header_size
    total_packets = (total_data_bytes + max_payload_size - 1) // max_payload_size

    for i, start in enumerate(range(0, total_data_bytes, max_payload_size), 1):  # Start sequence number from 1
        payload_size = min(total_data_bytes - start, max_payload_size)
        packet_payload = bytes.fromhex(hex_data[start*2:(start+payload_size)*2])
        packet_payload += b'\x00' * (max_payload_size - payload_size)

        header = struct.pack(header_format, container_type, total_packets, image_id_counter, i)  # Include sequence number
        full_packet = header + packet_payload

        if len(full_packet) != packet_size:
            raise ValueError(f"Full packet size mismatch: Expected {packet_size}, got {len(full_packet)}")

        udp_socket.sendto(full_packet, (host, port))
        print(f"Sent packet {i}/{total_packets} for Image ID {image_id_counter} to {host}:{port}")
        time.sleep(0.1)

    udp_socket.close()
    image_id_counter += 1

class ImageHandler(FileSystemEventHandler):
    def on_created(self, event):
        if not event.is_directory and event.src_path.lower().endswith(('.jpg', '.jpeg')):
            print(f"New image detected: {event.src_path}")
            hex_data = image_to_hex(event.src_path, quality=100)
            append_hex_to_csv(hex_data, csv_file_path)
            send_packet(hex_data)

observer = Observer()
observer.schedule(ImageHandler(), watch_directory, recursive=False)
observer.start()

print(f"Monitoring {watch_directory} for new images...")

try:
    while True:
        time.sleep(1)
except KeyboardInterrupt:
    print("Stopping image monitor...")
    observer.stop()
    observer.join()
