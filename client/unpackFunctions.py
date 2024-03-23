import struct

def unpackPivData(decodedData):
    """Unpack PIV Data."""
    vLine, pW, iA, vV = struct.unpack('>ifff', decodedData[12:])
    return [vLine, round(pW, 2), round(iA, 2), round(vV, 2)]

def unpackSoftwareData(decodedData):
    """Unpack Software Data."""
    software, = struct.unpack('>f', decodedData[12:16])
    return [round(software, 2)]

def unpackStorageData(decodedData):
    """Unpack Storage Data."""
    storage, = struct.unpack('>f', decodedData[12:16])
    return [round(storage, 2)]

def unpackEnvironmentalSensorData(decodedData):
    """Unpack Environmental Sensor Data."""
    sensorNumber, temperature, pressure, humidity, gas = struct.unpack('>iffff', decodedData[12:])
    return [sensorNumber, round(temperature, 2), round(pressure, 2), round(humidity, 2), round(gas, 2)]

def unpackSpectrometerData(decodedData):
    """Unpack Spectrometer Data."""
    spectroNumber, spectro415, spectro480, spectro555 = struct.unpack('>ifff', decodedData[12:])
    return [spectroNumber, round(spectro415, 2), round(spectro480, 2), round(spectro555, 2)]

def unpackTcsTemperatureData(decodedData):
    """Unpack TCS Temperature Data."""
    temperature1, temperature2, temperature3, temperature4 = struct.unpack('>ffff', decodedData[12:])
    return [round(temperature1, 2), round(temperature2, 2), round(temperature3, 2), round(temperature4, 2)]

unpackingFunctions = {
    1: unpackPivData,
    2: unpackSoftwareData,
    3: unpackStorageData,
    4: unpackEnvironmentalSensorData,
    5: unpackSpectrometerData,
    6: unpackTcsTemperatureData,
}
