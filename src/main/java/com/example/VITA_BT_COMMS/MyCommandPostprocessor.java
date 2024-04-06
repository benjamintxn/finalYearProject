package com.example.VITA_BT_COMMS;

import java.io.IOException;
import org.yamcs.commanding.PreparedCommand;
import org.yamcs.tctm.CommandPostprocessor;
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
                
            case "ExecuteEnvironmentalSimulator":
                executeScript("/Users/bentan/finalYearProject/VITA/environmental_simulator.py");
                break;
            case "ExecuteExperimentSimulator":
                executeScript("/Users/bentan/finalYearProject/VITA/experiment_simulator.py");
                break;
            case "ExecuteHousekeepingSimulator":
                executeScript("/Users/bentan/finalYearProject/VITA/housekeeping_simulator.py");
                break;
            case "ExecuteImageWatcherAndUploader":
                executeScript("/Users/bentan/finalYearProject/VITA/image_watcher.py");
                executeScript("/Users/bentan/finalYearProject/VITA/image_uploader.py");
                break;
            case "ExecuteCSVWatcher":
                executeScript("/Users/bentan/finalYearProject/VITA/csv_watcher.py");
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
