import os
from PIL import Image

def compressImage(image_path, output_directory):
    """
    Compresses an image and saves it to a specified output directory.
    :param image_path: Path to the original image to be compressed.
    :param output_directory: Directory where the compressed image will be saved.
    :return: Path to the saved compressed image.
    """
    os.makedirs(output_directory, exist_ok=True)
    base_name = os.path.basename(image_path)
    compressed_filename = f"{os.path.splitext(base_name)[0]}_compressed.jpg"
    output_path = os.path.join(output_directory, compressed_filename)
    with Image.open(image_path) as img:
        img.save(output_path, "JPEG", optimize=True, quality=15)
    return output_path
