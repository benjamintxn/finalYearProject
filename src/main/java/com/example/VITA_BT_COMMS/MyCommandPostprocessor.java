package com.example.VITA_BT_COMMS;

import org.yamcs.commanding.PreparedCommand;
import org.yamcs.tctm.CommandPostprocessor;
import java.io.IOException;
import org.yamcs.YConfiguration;

public class MyCommandPostprocessor implements CommandPostprocessor {

    public MyCommandPostprocessor(String yamcsInstance) {
        // Constructor used without YAML configuration
    }

    public MyCommandPostprocessor(String yamcsInstance, YConfiguration config) {
        // Constructor used with YAML configuration
    }

    @Override
    public byte[] process(PreparedCommand pc) {
        
        String fullCommandName = pc.getCommandName();
        String[] parts = fullCommandName.split("/");
        String commandName = parts[parts.length - 1];
        switch (commandName) {

            case "Execute PIV Simulator":
                executeScript("/Users/bentan/finalYearProject/VITA/S1_Housekeeping_Simulators/piv_simulator.py");
                break;    
            case "Execute Software Simulator":
                executeScript("/Users/bentan/finalYearProject/VITA/S1_Housekeeping_Simulators/software_simulator.py");
                break;
            case "Execute Storage Simulator":
                executeScript("/Users/bentan/finalYearProject/VITA/S1_Housekeeping_Simulators/storage_simulator.py");
                break;    
            case "Execute Environmental Sensor Simulator":
                executeScript("/Users/bentan/finalYearProject/VITA/S2_Environmental_Simulator/environmental_sensor_simulator.py");
                break;
            case "Execute Spectrometer Simulator":
                executeScript("/Users/bentan/finalYearProject/VITA/S3_Experiement_Simulators/spectrometer_simulator.py");
                break;
            case "Execute TCS Temperature Simulator":
                executeScript("/Users/bentan/finalYearProject/VITA/S3_Experiement_Simulators/tcs_temperature_simulator.py");
                break;
            case "Execute Image Watcher And Uploader":
                executeScript("/Users/bentan/finalYearProject/VITA/S4_Image_Simulators/image_watcher.py");
                executeScript("/Users/bentan/finalYearProject/VITA/S4_Image_Simulators/image_uploader.py");
                break;
            case "Execute CSV Watcher":
                executeScript("/Users/bentan/finalYearProject/VITA/SCSV_Data_Configurations/csv_watcher.py");
                break;
            default:
                System.err.println("Unknown command: " + commandName);
                
        }

        return pc.getBinary();
        
    }

    private void executeScript(String scriptPath) {
        
        try {

             String pythonExecutablePath = "/usr/local/bin/python3";
             Process process = Runtime.getRuntime().exec(pythonExecutablePath + " " + scriptPath);
             System.out.println("Executing script: " + scriptPath);

         } catch (IOException e) {

             System.err.println("Error executing script: " + e.getMessage());

         }
        
    }
    
}