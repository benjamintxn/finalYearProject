from PIL import Image
import os

def compress_image(image_path, output_directory):
    # Ensure the output directory exists
    os.makedirs(output_directory, exist_ok=True)

    # Define the output path for the compressed image
    base_name = os.path.basename(image_path)
    output_path = os.path.join(output_directory, os.path.splitext(base_name)[0] + "_compressed.jpg")
    
    # Open and compress the image
    with Image.open(image_path) as img:
        img.save(output_path, "JPEG", optimize=True, quality=15)
    
    return output_path
