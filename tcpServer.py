import socket
import threading

# Configuration
LISTEN_HOST = 'localhost'
LISTEN_PORT_IMAGE = 10019  # Port for receiving image data from imagesSimulator
LISTEN_PORT_YAMCS = 10018  # Port for YAMCS to connect and receive forwarded data

# Global variable to keep track of the YAMCS connection
yamcs_connection = None

def forward_to_yamcs(data, packet_number, total_packets):
    global yamcs_connection
    if yamcs_connection:
        try:
            # Send each packet as a separate unit
            yamcs_connection.sendall(data)
            print(f"Sent packet {packet_number}/{total_packets} to YAMCS at {LISTEN_HOST}:{LISTEN_PORT_YAMCS}.")
        except Exception as e:
            print(f"Error sending packet {packet_number} to YAMCS: {e}")
            # Consider handling reconnection or error notification here

def handle_image_connections():
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as image_server:
        image_server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        image_server.bind((LISTEN_HOST, LISTEN_PORT_IMAGE))
        image_server.listen()
        print(f"tcpServer listening on {LISTEN_HOST}:{LISTEN_PORT_IMAGE} for images...")

        while True:
            conn, addr = image_server.accept()
            print(f"Connected by {addr} on port {LISTEN_PORT_IMAGE}")
            threading.Thread(target=process_image_connection, args=(conn,)).start()

def process_image_connection(conn):
    with conn:
        try:
            # Buffer to hold incoming binary data
            data_buffer = bytearray()

            # Receive all data from the connection
            while True:
                data = conn.recv(1024)
                if not data:
                    break  # No more data, connection closed
                data_buffer += data

            # Segment data into chunks of 1000 bytes and forward to YAMCS
            packet_size = 20000  # Maximum packet size in bytes
            total_packets = len(data_buffer) // packet_size + (1 if len(data_buffer) % packet_size else 0)

            for i in range(total_packets):
                start_index = i * packet_size
                # Ensure the last packet contains the remainder of the data
                segment = data_buffer[start_index:start_index + packet_size]
                forward_to_yamcs(segment, i+1, total_packets)

        except Exception as e:
            print(f"Error processing image connection: {e}")
        finally:
            conn.close()



def handle_yamcs_connections():
    global yamcs_connection
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as yamcs_server:
        yamcs_server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        yamcs_server.bind((LISTEN_HOST, LISTEN_PORT_YAMCS))
        yamcs_server.listen()
        print(f"tcpServer ready to connect with YAMCS on {LISTEN_HOST}:{LISTEN_PORT_YAMCS}.")

        while True:
            conn, addr = yamcs_server.accept()
            with conn:
                print(f"YAMCS connected.")
                if yamcs_connection is None:
                    yamcs_connection = conn
                    try:
                        while True:
                            data = conn.recv(20000)  # Adjust buffer size as needed
                            if not data:
                                break  # YAMCS disconnected or sent empty data
                            # Process incoming data if necessary
                    finally:
                        yamcs_connection = None
                        print("YAMCS connection closed.")
                else:
                    print("Existing YAMCS connection already being handled.")
                    conn.close()


# Start threads to handle connections on both ports
image_thread = threading.Thread(target=handle_image_connections)
yamcs_thread = threading.Thread(target=handle_yamcs_connections)

image_thread.start()
yamcs_thread.start()
