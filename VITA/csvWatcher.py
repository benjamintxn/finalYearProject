import time
import os
from datetime import datetime
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler
from simulatorUtils import convertDataRowToBinary, sendPacket
from directoryConfig import simulatorConfig

class FileWatcher(FileSystemEventHandler):
    def __init__(self, config):
        super().__init__()
        self.config = config
        self.last_sent_line = {}
        self.last_sent_timestamp = {}
        self.last_event_time = 0  # Changed to 0 for initial value
        self.initialize_config()

    def initialize_config(self):
        # Initializes file tracking based on provided configuration
        for directory_path, settings in self.config.items():
            csv_file_path = os.path.join(directory_path, settings['csv_file_name'])
            self.last_sent_line[csv_file_path] = 0
            self.last_sent_timestamp[csv_file_path] = None

    def on_modified(self, event):
        # Processes file modifications only for tracked files
        if os.path.isfile(event.src_path) and event.src_path in self.last_sent_line:
            self.process_modification(event.src_path)
        else:
            print(f"Ignoring modification: {event.src_path}")

    def process_modification(self, csv_file_path):
        # Debounces rapid successive modifications
        if time.time() - self.last_event_time < 1:
            return
        self.last_event_time = time.time()
        self.handle_file_modification(csv_file_path)

    def handle_file_modification(self, csv_file_path):
        with open(csv_file_path, 'r') as file:
            lines = file.readlines()
            # Process only new lines since the last recorded line
            new_lines = lines[self.last_sent_line[csv_file_path]:]

            for i, line in enumerate(new_lines):
                try:
                    row = line.strip().split(',')
                    if len(row) < 2:
                        continue

                    formatted_time = datetime.strptime(row[0], '%Y-%m-%d %H:%M:%S (UTC)')
                    timestamp = int(formatted_time.timestamp())

                    # Prevents re-sending for the same timestamp
                    if self.last_sent_timestamp.get(csv_file_path) == timestamp:
                        continue

                    # Updates timestamp for the file
                    self.last_sent_timestamp[csv_file_path] = timestamp

                    # Prepares data for sending
                    settings = self.config[os.path.dirname(csv_file_path)]
                    packetData = [settings['packet_id'], timestamp] + [int(val) if i <= 1 else float(val) for i, val in enumerate(row[1:], 1)]
                    binaryData = convertDataRowToBinary(packetData)
                    print(f"Sending: {binaryData}")
                    sendPacket(binaryData, settings['address'])
                except ValueError as e:
                    print(f"Error processing line: {line}. Error: {e}")

            # Updates the index of the last processed line
            self.last_sent_line[csv_file_path] += len(new_lines)

def main():
    observer = Observer()
    for path in simulatorConfig:
        event_handler = FileWatcher(simulatorConfig)
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
