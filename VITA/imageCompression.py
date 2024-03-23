from PIL import Image
import os

def compressImage(image_path, output_directory):
    """
    Compresses an image and saves the compressed version to a specified directory.

    Parameters:
        image_path (str): The path to the original image.
        output_directory (str): The directory where the compressed image will be saved.

    Returns:
        str: The path to the compressed image.
    """

    # Ensure the output directory exists
    os.makedirs(output_directory, exist_ok=True)

    # Extract the base name of the image and define the output path
    base_name = os.path.basename(image_path)
    compressed_filename = f"{os.path.splitext(base_name)[0]}_compressed.jpg"
    output_path = os.path.join(output_directory, compressed_filename)
    
    # Open the original image
    with Image.open(image_path) as img:
        # Compress and save the image with reduced quality
        img.save(output_path, "JPEG", optimize=True, quality=15)
    
    # Return the path to the compressed image
    return output_path
