import time
import os
from datetime import datetime
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler
from simulator_config import convertDataRowToBinary, sendPacket
from directory_config import simulatorDirectory

class FileWatcher(FileSystemEventHandler):
    """
    Watches for file modifications in specified directories and processes those modifications accordingly.
    """
    def __init__(self, config):
        """
        Initializes the file watcher with a given configuration.
        :param config: A dictionary mapping directory paths to their respective settings.
        """
        super().__init__()
        self.config = config
        self.last_sent_line = {}
        self.last_sent_timestamp = {}
        self.last_event_time = 0
        self.initialiseConfig()

    def initialiseConfig(self):
        """
        Prepares the watcher by setting up tracking for each file specified in the configuration.
        """
        for directory_path, settings in self.config.items():
            csv_file_path = os.path.join(directory_path, settings['csv_file_name'])
            self.last_sent_line[csv_file_path] = 0
            self.last_sent_timestamp[csv_file_path] = 0

    def on_modified(self, event):
        if os.path.isfile(event.src_path) and event.src_path in self.last_sent_line:
            self.processModification(event.src_path)

    def processModification(self, csv_file_path):
        print(f"Processing received data from {csv_file_path}")
        self.handleFileModification(csv_file_path)

    def handleFileModification(self, csv_file_path):
        with open(csv_file_path, 'r') as file:
            lines = file.readlines()
            start_index = self.last_sent_line.get(csv_file_path, 0) + 1
            for index, line in enumerate(lines[start_index:], start=start_index):
                try:
                    row = line.strip().split(',')
                    if len(row) < 2:
                        continue
                    formatted_time = datetime.strptime(row[0], '%Y-%m-%d %H:%M:%S (UTC)')
                    timestamp = int(formatted_time.timestamp())
                    if timestamp > self.last_sent_timestamp.get(csv_file_path, 0):
                        self.last_sent_timestamp[csv_file_path] = timestamp
                        settings = self.config[os.path.dirname(csv_file_path)]
                        packetData = [settings['packet_id'], timestamp]
                        for val in row[1:]:
                            try:
                                packetData.append(int(val))
                            except ValueError:
                                try:
                                    packetData.append(float(val))
                                except ValueError:
                                    print(f"Warning: Value '{val}' in line {index} could not be processed as int or float.")
                                    continue
                        binaryData = convertDataRowToBinary(packetData)
                        sendPacket(binaryData, settings['address'])
                        self.last_sent_line[csv_file_path] = index
                except ValueError as e:
                    print(f"Error processing line: {line}. Error: {e}")

def main():
    """
    Sets up and starts the file watching process.
    """
    observer = Observer()
    for path, settings in simulatorDirectory.items():
        print(f"Setting up watcher for {path}")
        event_handler = FileWatcher({path: settings})
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