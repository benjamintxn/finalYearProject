package com.example.VITA_BT_COMMS;

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
<<<<<<< HEAD
                
            case "Execute Environmental Simulator":
=======

            case "ExecuteHousekeepingSimulator":
                executeScript("/Users/bentan/finalYearProject/VITA/housekeeping_simulator.py");
                break;
            case "ExecuteEnvironmentalSimulator":
>>>>>>> origin/main
                executeScript("/Users/bentan/finalYearProject/VITA/environmental_simulator.py");
                break;
            case "Execute Experiment Simulator":
                executeScript("/Users/bentan/finalYearProject/VITA/experiment_simulator.py");
                break;
<<<<<<< HEAD
            case "Execute Housekeeping Simulator":
                executeScript("/Users/bentan/finalYearProject/VITA/housekeeping_simulator.py");
                break;
            case "Execute Image Watcher And Uploader":
=======
            case "ExecuteImageWatcherAndUploader":
>>>>>>> origin/main
                executeScript("/Users/bentan/finalYearProject/VITA/image_watcher.py");
                executeScript("/Users/bentan/finalYearProject/VITA/image_uploader.py");
                break;
            case "Execute CSV Watcher":
                executeScript("/Users/bentan/finalYearProject/VITA/csv_watcher.py");
                break;
            default:
                System.err.println("Unknown command: " + commandName);
                
        }

        return pc.getBinary();
        
    }

    private void executeScript(String scriptPath) {
        
        System.out.println("Executing script: " + scriptPath);
        
    }
    
}
