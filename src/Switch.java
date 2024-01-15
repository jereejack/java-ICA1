// Import statements for List and ArrayList might be required at the top of your file
import java.util.List;
import java.util.ArrayList;

public class Switch extends Device {
    private CamTable camTable;

    public Switch() {
        this.camTable = new CamTable();
    }

    @Override
    public void handEvent(Event event) {
        // Implementation of event handling specific to Switch
    }

    @Override
    public void registerLogger(Logger logger) {
        // Implementation to register a logger with the Switch
    }

    // Method to populate the CAM table with a new entry
    public void addCamEntry(CamEntry entry) {
        camTable.addEntry(entry);
    }

    // Method to retrieve a CAM entry by MAC address
    public CamEntry getCamEntryByMacAddress(String macAddress) {
        return camTable.getEntry(macAddress);
    }

   
}


