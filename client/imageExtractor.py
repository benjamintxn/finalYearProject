import os
import time
from yamcs.client import YamcsClient
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler

# Configuration
yamcs_address = 'http://localhost:8090'  # Adjust as necessary
bucket_name = 'fileStore'  # The bucket to listen to
local_download_dir = '/Users/bentan/finalYearProject/client/4. Images'  # Where to save images
poll_interval = 10  # How often to check the bucket (in seconds)

class ImageHandler(FileSystemEventHandler):
    def __init__(self, storage_client):
        super().__init__()
        self.storage_client = storage_client

    def on_created(self, event):
        if not event.is_directory and event.src_path.endswith('.jpg'):
            print(f"New image detected: {event.src_path}")
            image_name = os.path.basename(event.src_path)
            self.download_image(image_name)

    def download_image(self, image_name):
        local_path = os.path.join(local_download_dir, image_name)
        with open(local_path, 'wb') as file:
            # Download the object using its name
            data = self.storage_client.download_object(bucket_name, image_name)
            # Write the downloaded data to the local file
            file.write(data)
        print(f"Downloaded {image_name} to {local_path}")


def main():
    yamcs_client = YamcsClient(yamcs_address)
    storage_client = yamcs_client.get_storage_client()

    # Create a watchdog observer
    observer = Observer()
    event_handler = ImageHandler(storage_client)
    observer.schedule(event_handler, local_download_dir, recursive=False)
    observer.start()

    while True:
        print("Checking for new images...")
        # Retrieve the list of objects in the bucket
        object_listing = storage_client.list_objects(bucket_name)
        for obj in object_listing.objects:
            local_path = os.path.join(local_download_dir, obj.name)
            if not os.path.exists(local_path):
                print(f"Downloading new image: {obj.name}")
                # Download the object using its name
                with open(local_path, 'wb') as file:
                    storage_client.download_object(bucket_name, obj.name)
                print(f"Saved to {local_path}")
        time.sleep(poll_interval)

if __name__ == "__main__":
    main()
