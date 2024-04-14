import os
import time
from yamcs.client import YamcsClient
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler

YAMCS_ADDRESS = 'http://localhost:8090'
BUCKET_NAME = 'fileStore'
OUTPUT_DIRECTORY = '/Users/bentan/finalYearProject/client/4. Images'

class ImageHandler(FileSystemEventHandler):
    def __init__(self, storage_client):
        super().__init__()
        self.storage_client = storage_client

    def on_created(self, event):
        if not event.is_directory and event.src_path.endswith('.jpg'):
            image_name = os.path.basename(event.src_path)
            print(f"New image detected: {image_name}")
            self.download_image(image_name)

    def download_image(self, image_name):
        local_path = os.path.join(OUTPUT_DIRECTORY, image_name)
        data = self.storage_client.download_object(BUCKET_NAME, image_name)
        with open(local_path, 'wb') as file:
            file.write(data)
        print(f"Downloaded {image_name} to {local_path}")

def main():
    client = YamcsClient(YAMCS_ADDRESS)
    storage_client = client.get_storage_client()
    observer = Observer()
    event_handler = ImageHandler(storage_client)
    observer.schedule(event_handler, OUTPUT_DIRECTORY, recursive=False)
    observer.start()
    try:
        while True:
            print("Checking for new images...")
            object_listing = storage_client.list_objects(BUCKET_NAME)
            for obj in object_listing.objects:
                local_path = os.path.join(OUTPUT_DIRECTORY, obj.name)
                if not os.path.exists(local_path):
                    print(f"Downloading new image: {obj.name}")
                    with open(local_path, 'wb') as file:
                        storage_client.download_object(BUCKET_NAME, obj.name)
                    print(f"Saved to {local_path}")
            time.sleep(10)
    finally:
        observer.stop()
        observer.join()

if __name__ == "__main__":
    main()