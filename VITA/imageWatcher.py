import time
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler
from yamcsFileUploader import uploadToYAMCS
from imageCompression import compress_image  # Import the compress_image function

class Watcher:
    DIRECTORY_TO_WATCH = "/Users/bentan/finalYearProject/VITA/4. Images"

    def __init__(self):
        self.observer = Observer()

    def run(self):
        event_handler = Handler()
        self.observer.schedule(event_handler, self.DIRECTORY_TO_WATCH, recursive=True)
        self.observer.start()
        try:
            while True:
                time.sleep(5)
        except:
            self.observer.stop()
            print("Observer Stopped")
        self.observer.join()

class Handler(FileSystemEventHandler):
    @staticmethod
    def on_created(event):
        if event.is_directory:
            return None
        elif event.event_type == 'created':
            # Take action here. event.src_path contains the file path.
            compressed_image_dir = "/Users/bentan/finalYearProject/VITA/Compressed Images"
            compressed_image_path = compress_image(event.src_path, compressed_image_dir)
            uploadToYAMCS(compressed_image_path)

if __name__ == "__main__":
    w = Watcher()
    w.run()
