import time
import os
import struct
from datetime import datetime
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler
from simulatorUtils import convertDataRowToBinary, sendPacket

# Configuration for each type of simulator data
simulator_config = {
    '/Users/bentan/finalYearProject/VITA/1. Housekeeping': {
        'address': ('localhost', 10015),
        'packet_id': 1,
    },
    '/Users/bentan/finalYearProject/VITA/2. Environmental': {
        'address': ('localhost', 10016),
        'packet_id': 4,
    },
    '/Users/bentan/finalYearProject/VITA/3. Experiment': {
        'address': ('localhost', 10017),
        'packet_id': 5,
    },
}

class FileWatcher(FileSystemEventHandler):
    def __init__(self, config):
        super(FileWatcher, self).__init__()
        self.config = config
        self.last_sent_line = {}
        self.last_sent_timestamp = {}  # Initialize the dictionary for tracking timestamps
        for directory_path, settings in config.items():
            csv_file_name = settings['csv_file_name']
            csv_file_path = os.path.join(directory_path, csv_file_name)
            self.last_sent_line[csv_file_path] = 0
            self.last_sent_timestamp[csv_file_path] = None  # Set initial timestamp to None
        self.last_event_time = time.time()
        print("Watcher initialised. Monitoring for changes...")

    def on_modified(self, event):
        print(f"Modification detected: {event.src_path}")
        if os.path.isfile(event.src_path) and event.src_path in self.last_sent_line:
            print("File modification confirmed.")
            directory_path = os.path.dirname(event.src_path)
            settings = self.config[directory_path]
            self.handle_file_modification(event.src_path, settings)
        else:
            print(f"Ignoring modification: {event.src_path} is not in the list of monitored files.")

    def handle_file_modification(self, csv_file_path, settings):
        current_time = time.time()
        # Check if modification happens too quickly (debounce)
        if current_time - self.last_event_time < 1:  # Debounce period
            return
        self.last_event_time = current_time

        with open(csv_file_path, 'r') as file:
            lines = file.readlines()
            total_lines = len(lines)
            # Adjust start index based on whether we've sent data before
            start_index = self.last_sent_line[csv_file_path] if self.last_sent_line[csv_file_path] > 0 else 1

            # Determine new lines to process
            new_lines = lines[start_index:]

            for i, line in enumerate(new_lines, start=start_index):
                try:
                    row = line.strip().split(',')
                    if len(row) < 2:
                        continue

                    formatted_time = datetime.strptime(row[0], '%Y-%m-%d %H:%M:%S (UTC)')
                    timestamp = int(formatted_time.timestamp())

                    # Skip sending if this timestamp was the last one sent for this file
                    if self.last_sent_timestamp.get(csv_file_path) == timestamp:
                        continue  # This prevents sending the first row twice

                    self.last_sent_timestamp[csv_file_path] = timestamp  # Update last sent timestamp

                    packetData = [settings['packet_id'], timestamp] + [int(val) if i <= 2 else float(val) for i, val in enumerate(row[1:], 1)]
                    binaryData = convertDataRowToBinary(packetData)
                    print(f"Sending: {binaryData}")
                    sendPacket(binaryData, settings['address'])
                except ValueError as e:
                    print(f"Error processing line: {line}. Error: {e}")

            # Update the last line sent only if there were new lines to process
            if new_lines:
                self.last_sent_line[csv_file_path] = total_lines

def main():
    # Update simulator_config to include 'csv_file_name' for each directory
    simulator_config = {
        '/Users/bentan/finalYearProject/VITA/1. Housekeeping': {
            'address': ('localhost', 10015),
            'packet_id': 1,
            'csv_file_name': 'PIV_Data.csv',  # Specify the exact CSV file name
        },
        '/Users/bentan/finalYearProject/VITA/2. Environmental': {
            'address': ('localhost', 10016),
            'packet_id': 4,
            'csv_file_name': 'Environmental_Sensor_Data.csv',
        },
        '/Users/bentan/finalYearProject/VITA/3. Experiment': {
            'address': ('localhost', 10017),
            'packet_id': 5,
            'csv_file_name': 'Spectrometer_Data.csv',
        },
    }
    observer = Observer()
    for path, settings in simulator_config.items():
        event_handler = FileWatcher(simulator_config)
        observer.schedule(event_handler, path, recursive=False)
    observer.start()
    try:
        while True:
            time.sleep(1)
    except KeyboardInterrupt:
        observer.stop()
    observer.join()

if __name__ == "__main__":
    main()
