from yamcs.client import YamcsClient

def uploadToYAMCS(file_path):
    """
    Uploads a specified file to a YAMCS bucket.
    :param file_path: Path of the file to upload.
    """
    client = YamcsClient('http://localhost:8090')
    storage_client = client.get_storage_client()
    bucket_name = 'fileStore'
    object_name = file_path.split('/')[-1]
    with open(file_path, 'rb') as file_to_upload:
        storage_client.upload_object(bucket_name, object_name, file_to_upload)
        print(f"Successfully uploaded {object_name} to bucket '{bucket_name}'.")
