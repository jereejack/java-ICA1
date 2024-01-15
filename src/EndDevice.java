
import java.util.ArrayList;
import java.util.List;

public class EndDevice extends Device {

    // Constructor for EndDevice
    public EndDevice(String id, String macAddress, Protocol protocol) {
        this.id = id;
        this.macAddress = macAddress;
        this.protocol = protocol;
        this.networkingInterface = new ArrayList<>(); 
        this.routingTable = new RoutingTable(); 
    }

    @Override
    public void handEvent(Event event) {
        // Logic to handle different types of events.
        // For example, if the event is a data reception event:
        if (event instanceof DataReceptionEvent) {
            DataReceptionEvent dataEvent = (DataReceptionEvent) event;
            receiveData(dataEvent.getData());
        }
       
    }

    @Override
    public void registerLogger(Logger logger) {
        // Logic to register a logger, might simply be storing the logger reference
        // and using it to log messages throughout the EndDevice class.
    }

    // Method to send data to another device. This could be through a network interface
    public void sendData(String data, Device recipient) {
        // Logic to send data. This might include looking up the recipient in the routing table,
        // and then using one of the network interfaces to send the data.
    }

    // Method to receive data. This might be called by handEvent or by a NetworkInterface
    public void receiveData(String data) {
        // Logic to handle received data. This could include processing the data or passing it along to an application.
    }


}

