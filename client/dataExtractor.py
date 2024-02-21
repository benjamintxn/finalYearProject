import requests
import csv
import os
import base64
import time
import struct
from datetime import datetime, timezone, timedelta

# YAMCS API details
yamcs_instance = "VITA_BT_COMMS"
stream_name = "tm_realtime"
yamcs_base_url = "http://localhost:8090"

# Output CSV configuration
output_directory = "/Users/bentan/finalYearProject/client/1. Housekeeping"
csv_filename = "Output_PIV_Data.csv"
csv_file_path = os.path.join(output_directory, csv_filename)

# Ensure the output directory exists
if not os.path.exists(output_directory):
    os.makedirs(output_directory, exist_ok=True)

# Initialize the last processed packet's generation time to the current UTC time
last_packet_time = datetime.now(timezone.utc)

def fetch_packets_from_archive(last_time):
    # Convert last_packet_time to the format expected by YAMCS API
    formatted_last_time = last_time.strftime('%Y-%m-%dT%H:%M:%S.%f')[:-3] + "Z"
    
    # API endpoint for accessing packets from the archive, filtering by generation time
    yamcs_archive_api_url = f"{yamcs_base_url}/api/archive/{yamcs_instance}/packets?stream={stream_name}&start={formatted_last_time}"

    response = requests.get(yamcs_archive_api_url)
    if response.status_code == 200:
        packets = response.json().get('packet', [])
        return packets
    else:
        print(f"Failed to fetch packets from YAMCS Archive: {response.status_code}")
        return []

def extract_csv_row_from_packet(packet):
    try:
        base64_encoded_data = packet.get("packet")
        decoded_data = base64.b64decode(base64_encoded_data)

        # Unpack binary data
        current_time, phase, v_line = struct.unpack('>iii', decoded_data[:12])  # First 12 bytes: int, int, int
        p_w, i_a, v_v = struct.unpack('>fff', decoded_data[12:])  # Next 12 bytes: float, float, float

        # Round the float values to 2 decimal places
        p_w, i_a, v_v = round(p_w, 2), round(i_a, 2), round(v_v, 2)

        # Convert the UNIX timestamp to a formatted string
        formatted_time = datetime.utcfromtimestamp(current_time).strftime('%Y-%m-%d %H:%M:%S (UTC)')

        return [formatted_time, phase, v_line, p_w, i_a, v_v]
    except Exception as e:
        print(f"Error processing packet: {e}")
        return None

while True:
    packets = fetch_packets_from_archive(last_packet_time)

    with open(csv_file_path, 'a', newline='') as csvfile:
        writer = csv.writer(csvfile)
        for packet in packets:
            csv_row = extract_csv_row_from_packet(packet)
            if csv_row:
                writer.writerow(csv_row)
                # Update last_packet_time to the generation time of the current packet
                packet_time = datetime.strptime(packet['generationTime'], '%Y-%m-%dT%H:%M:%S.%fZ').replace(tzinfo=timezone.utc)
                if packet_time > last_packet_time:
                    last_packet_time = packet_time

    # Add a small delay to ensure that the generation time of new packets is strictly after the last_packet_time
    last_packet_time += timedelta(milliseconds=1)

    # Sleep for some time before the next fetch
    time.sleep(1)  # Adjust the sleep time as needed
