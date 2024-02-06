import requests
import csv
import os
import base64

# YAMCS API details
yamcs_instance = "myproject"
stream_name = "tm_realtime"
yamcs_base_url = "http://localhost:8090"  # Adjust if YAMCS is not on localhost or uses a different port

# API endpoint for accessing packets from the archive
yamcs_archive_api_url = f"{yamcs_base_url}/api/archive/{yamcs_instance}/packets?stream={stream_name}"

# Directory and CSV file where data will be saved
output_directory = "/Users/bentan/finalYearProject/client/1.Housekeeping"
csv_filename = "output_data.csv"
csv_file_path = os.path.join(output_directory, csv_filename)

# Ensure the output directory exists
os.makedirs(output_directory, exist_ok=True)

# Function to fetch packets from YAMCS Archive
def fetch_packets_from_archive():
    response = requests.get(yamcs_archive_api_url)
    if response.status_code == 200:
        packets = response.json()
        # Assuming 'packet' is the key containing packet data, adjust as necessary
        return packets.get('packet', [])
    else:
        print(f"Failed to fetch packets from YAMCS Archive: {response.status_code}")
        return []

# Function to extract data from a packet and return as a CSV row
import base64

def extract_csv_row_from_packet(packet):
    # Decode the packet data from base64
    try:
        base64_encoded_data = packet.get("packet")
        decoded_data = base64.b64decode(base64_encoded_data)
        
        # Attempt to decode the binary data to a UTF-8 string
        decoded_string = decoded_data.decode('utf-8')

        # Check if the decoded string has the expected number of commas
        if decoded_string.count(',') == 5:
            return decoded_string.split(',')
        else:
            # Log or silently ignore unexpected data format
            # print(f"Unexpected data format, skipping packet: {decoded_string}")
            return None
    except UnicodeDecodeError:
        # Silently ignore UnicodeDecodeError errors
        # You can log these errors here if needed
        return None
    except Exception as e:
        # Handle other exceptions if necessary, or log them
        # print(f"Error decoding packet: {e}")
        return None

# Fetch packets from YAMCS Archive
packets = fetch_packets_from_archive()

# Write packet data to CSV
with open(csv_file_path, 'a', newline='') as csvfile:
    writer = csv.writer(csvfile)
    for packet in packets:
        csv_row = extract_csv_row_from_packet(packet)
        if csv_row is not None:  # Only write rows that are not None
            writer.writerow(csv_row)
