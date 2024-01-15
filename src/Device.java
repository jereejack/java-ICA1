import java.util.ArrayList;
import java.util.List;

public class Device {

    private String id;
    private String macAddress;
    private Protocol protocol;
    private List<NetworkInterface> networkInterfaces;
    private RoutingTable routingTable;

    public Device(String id, String macAddress) {
        this.id = id;
        this.macAddress = macAddress;
        this.networkInterfaces = new ArrayList<>();
        this.routingTable = new RoutingTable();
    }

    public void handleEvent(Event event) {
    }

    public void registerLogger(Logger logger) {
        protocol.registerLogger(logger);
    }
}

