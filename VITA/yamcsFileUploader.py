# yamcsFileUploader.py
from yamcs.client import YamcsClient

def uploadToYAMCS(file_path):
    client = YamcsClient('http://localhost:8090')
    storage_client = client.get_storage_client()
    bucket_name = 'fileStore'  # Specify your bucket name
    object_name = file_path.split('/')[-1]

    with open(file_path, 'rb') as f:
        storage_client.upload_object(bucket_name, object_name, f)
        print(f"Successfully uploaded {object_name} to bucket '{bucket_name}'")
