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

def image_to_hex(image_path, output_format='JPEG', quality=25):
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
    
    # Calculate total data bytes from hex data
    total_data_bytes = len(hex_data) // 2  # Convert hex length to byte length
    
    # Initial estimation of total packets
    estimated_total_packets = (total_data_bytes + packet_size - 1) // packet_size

    # Header format: two 4-byte (32-bit) integers for total_packets and image_id_counter
    header_format = '>II'  # '>' denotes big-endian, 'I' denotes unsigned int (4 bytes)
    max_possible_header = struct.calcsize(header_format)  # Calculate header size
    max_payload_size = packet_size - max_possible_header  # Adjust payload size

    # Recalculate total packets with adjusted payload size
    total_packets = (total_data_bytes + max_payload_size - 1) // max_payload_size

    for i in range(0, total_data_bytes, max_payload_size):
        payload_size = min(total_data_bytes - i, max_payload_size)
        packet_payload = bytes.fromhex(hex_data[i*2:(i+payload_size)*2])

        # Padding the payload if it's less than the max_payload_size
        packet_payload += b'\x00' * (max_payload_size - payload_size)

        # Pack total_packets and image_id_counter into bytes using struct
        header = struct.pack(header_format, total_packets, image_id_counter)

        full_packet = header + packet_payload  # Combine header and payload

        # Safety check: Ensure the full_packet size matches the specified packet_size
        if len(full_packet) != packet_size:
            raise ValueError(f"Full packet size mismatch: Expected {packet_size}, got {len(full_packet)}")

        udp_socket.sendto(full_packet, (host, port))
        
        current_packet_number = (i // max_payload_size) + 1
        print(f"Sent packet {current_packet_number}/{total_packets} for Image ID {image_id_counter} to {host}:{port}")
        
        time.sleep(0.01)

    udp_socket.close()
    image_id_counter += 1  # Increment image ID for the next image

class ImageHandler(FileSystemEventHandler):
    def on_created(self, event):
        if not event.is_directory and event.src_path.lower().endswith(('.jpg', '.jpeg')):
            print(f"New image detected: {event.src_path}")
            hex_data = image_to_hex(event.src_path, quality=25)
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
