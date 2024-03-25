from yamcs.client import YamcsClient

def uploadToYAMCS(file_path):
    """
    Uploads a specified file to a YAMCS bucket.
    :param file_path: Path of the file to upload.
    """
    # Establish a connection with the Yamcs server.
    client = YamcsClient('http://localhost:8090')

    # Obtain a storage client to interact with the bucket.
    storage_client = client.get_storage_client()

    # Specify the bucket name for uploading the file.
    bucket_name = 'fileStore'

    # Extract the file name from the file path for the object name in the bucket.
    object_name = file_path.split('/')[-1]

    # Open the file in binary read mode and upload it to the specified bucket.
    with open(file_path, 'rb') as file_to_upload:
        storage_client.upload_object(bucket_name, object_name, file_to_upload)
        print(f"Successfully uploaded {object_name} to bucket '{bucket_name}'.")
