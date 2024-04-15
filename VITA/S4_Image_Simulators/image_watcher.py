import time
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler
from image_uploader import uploadToYAMCS
from image_compression import compressImage

WATCH_DIRECTORY = "/Users/bentan/finalYearProject/VITA/4. Images"
COMPRESSED_IMAGE_DIRECTORY = "/Users/bentan/finalYearProject/VITA/Compressed Images"

class ImageWatcher:
    """
    A class to watch for new images in a specified directory, compress them,
    and upload to a server (YAMCS).
    """
    def __init__(self, WATCH_DIRECTORY):
        self.WATCH_DIRECTORY = WATCH_DIRECTORY
        self.observer = Observer()

    def run(self):
        """
        Initializes the directory watching process.
        :param WATCH_DIRECTORY: The directory path to monitor for new images.
        """
        event_handler = ImageEventHandler()
        self.observer.schedule(event_handler, self.WATCH_DIRECTORY, recursive=False)
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
    Event handler for new image files created in the watched directory.
    Compresses new images and uploads them to YAMCS upon detection.
    """
    @staticmethod
    def on_created(event):
        """
        Triggers upon the creation of a new file in the watched directory.
        :param event: The event object representing the file system event.
        """
        if not event.is_directory and event.event_type == 'created':
            print(f"New image detected: {event.src_path}")
            # Compress the new image and upload it
            compressed_image_path = compressImage(event.src_path, COMPRESSED_IMAGE_DIRECTORY)
            uploadToYAMCS(compressed_image_path)

if __name__ == "__main__":
    watcher = ImageWatcher(WATCH_DIRECTORY)
    print("Starting Image Watcher. Press Ctrl+C to stop.")
    watcher.run()
