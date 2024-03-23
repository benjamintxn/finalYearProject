# yamcsFileUploader.py
from yamcs.client import YamcsClient

def uploadToYAMCS(file_path):
    """
    Uploads a file to a specified bucket in YAMCS.

    Parameters:
        file_path (str): The path of the file to be uploaded.
    """

    # Initialize the Yamcs client connection
    client = YamcsClient('http://localhost:8090')

    # Retrieve the storage client to interact with buckets
    storage_client = client.get_storage_client()

    # Define the bucket name where the file will be uploaded
    bucket_name = 'fileStore'

    # Extract the filename from the file path
    object_name = file_path.split('/')[-1]

    # Open the file in binary read mode and upload it
    with open(file_path, 'rb') as file_to_upload:
        storage_client.upload_object(bucket_name, object_name, file_to_upload)
        print(f"Successfully uploaded {object_name} to bucket '{bucket_name}'.")
