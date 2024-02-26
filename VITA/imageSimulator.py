import os
import socket
import io
import struct
from PIL import Image
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler

# Global counter for image ID generation
image_id_counter = 1

# Configuration
watch_directory = '/Users/bentan/finalYearProject/VITA/4. Images'

# Ensure the directory exists
os.makedirs(watch_directory, exist_ok=True)

def image_to_hex(image_path, output_format='JPEG', quality=25):
    with Image.open(image_path) as img:
        img_byte_arr = io.BytesIO()
        img.save(img_byte_arr, format=output_format, quality=quality)
        img_byte_arr.seek(0)
        return img_byte_arr.getvalue().hex()

def send_packet(hex_data, host='localhost', port=10018, packet_size=1400):
    global image_id_counter

    udp_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    total_data_bytes = len(hex_data) // 2
    header_format = '>IIII'  # Including sequence number in header
    container_type = 7

    header_size = struct.calcsize(header_format)
    max_payload_size = packet_size - header_size
    total_packets = (total_data_bytes + max_payload_size - 1) // max_payload_size

    for i, start in enumerate(range(0, total_data_bytes, max_payload_size), 1):
        payload_size = min(total_data_bytes - start, max_payload_size)
        packet_payload = bytes.fromhex(hex_data[start*2:(start+payload_size)*2])

        header = struct.pack(header_format, container_type, total_packets, image_id_counter, i)
        full_packet = header + packet_payload

        udp_socket.sendto(full_packet, (host, port))  # This call blocks until the packet is sent
        print(f"Sent packet {i}/{total_packets} for Image ID {image_id_counter} to {host}:{port}")

    udp_socket.close()
    image_id_counter += 1

class ImageHandler(FileSystemEventHandler):
    def on_created(self, event):
        if not event.is_directory and event.src_path.lower().endswith(('.jpg', '.jpeg')):
            print(f"New image detected: {event.src_path}")
            hex_data = image_to_hex(event.src_path, quality=25)
            send_packet(hex_data)

observer = Observer()
observer.schedule(ImageHandler(), watch_directory, recursive=False)
observer.start()

print(f"Monitoring {watch_directory} for new images...")

try:
    while True:
        pass  # Keep the script running
except KeyboardInterrupt:
    print("Stopping image monitor...")
    observer.stop()
    observer.join()
