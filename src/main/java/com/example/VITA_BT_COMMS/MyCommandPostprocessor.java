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
        // Get the full command identifier and extract the actual command name
        String fullCommandName = pc.getCommandName();
        String[] parts = fullCommandName.split("/");
        String commandName = parts[parts.length - 1]; // Take the last part as the command name

        switch (commandName) {
            case "ExecuteEnvironmentalSimulator":
                executeScript("/Users/bentan/finalYearProject/VITA/environmentalSimulator.py");
                break;
            case "ExecuteImageSimulator":
                executeScript("/Users/bentan/finalYearProject/VITA/imageWatcher.py");
                break;
            case "ExecuteImageExtractor":
                executeScript("/Users/bentan/finalYearProject/client/imageExtractor.py");
                break;
            case "ExecuteExperimentSimulator":
                executeScript("/Users/bentan/finalYearProject/VITA/experimentSimulator.py");
                break;
            case "ExecuteHousekeepingSimulator":
                executeScript("/Users/bentan/finalYearProject/VITA/housekeepingSimulator.py");
                break;
            case "ExecuteDataExtractor":
                executeScript("/Users/bentan/finalYearProject/client/dataExtractor.py");
                break;
            default:
                System.err.println("Unknown command: " + commandName);
                // Handle unknown command appropriately
        }

        // Return the original binary as is
        return pc.getBinary();
    }

    private void executeScript(String scriptPath) {
        try {
            // Specify the full path to the Python executable
            String pythonExecutablePath = "/usr/local/bin/python3"; // Adjust this path as per your Python installation
            Process process = Runtime.getRuntime().exec(pythonExecutablePath + " " + scriptPath);
            System.out.println("Executing script: " + scriptPath);
            // Optionally, handle process output or errors here
        } catch (IOException e) {
            System.err.println("Error executing script: " + e.getMessage());
            // Handle exception appropriately
        }
    }
}
