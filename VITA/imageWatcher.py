import time
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler
from yamcsFileUploader import uploadToYAMCS
from imageCompression import compress_image  # Import the compress_image function

# Configuration
WATCH_DIRECTORY = "/Users/bentan/finalYearProject/VITA/4. Images"
COMPRESSED_IMAGE_DIR = "/Users/bentan/finalYearProject/VITA/Compressed Images"

class ImageWatcher:
    """
    Watches a directory for new images, compresses them, and uploads them to YAMCS.
    """
    def __init__(self, watch_directory):
        self.watch_directory = watch_directory
        self.observer = Observer()

    def run(self):
        event_handler = ImageEventHandler()
        self.observer.schedule(event_handler, self.watch_directory, recursive=True)
        self.observer.start()
        try:
            while True:
                time.sleep(5)
        except KeyboardInterrupt:
            self.observer.stop()
            print("Image Watcher stopped.")
        self.observer.join()

class ImageEventHandler(FileSystemEventHandler):
    """
    Handles new image files created in the watched directory.
    """
    @staticmethod
    def on_created(event):
        if not event.is_directory and event.event_type == 'created':
            print(f"New image detected: {event.src_path}")
            compressed_image_path = compress_image(event.src_path, COMPRESSED_IMAGE_DIR)
            uploadToYAMCS(compressed_image_path)

if __name__ == "__main__":
    watcher = ImageWatcher(WATCH_DIRECTORY)
    print("Starting Image Watcher. Press Ctrl+C to stop.")
    watcher.run()
