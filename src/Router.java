import java.util.List;
import java.util.Optional;

public class Router extends Device {

    public Router(String id, String macAddress, Protocol protocol) {
        this.id = id;
        this.macAddress = macAddress;
        this.protocol = protocol;
        this.networkingInterface = new ArrayList<>();
        this.routingTable = new RoutingTable();
    }

    @Override
    public void handEvent(Event event) {
        // Implementation of event handling specific to a Router.
       
        if (event instanceof RoutingUpdateEvent) {
            updateRoutingTable((RoutingUpdateEvent) event);
        }
        // Handle other types of events
    }

    @Override
    public void registerLogger(Logger logger) {
        // Logic to register a logger specific to the Router.
        // This could involve storing the logger instance and using it within the Router class.
    }

    // Router-specific method to update the routing table based on an event
    private void updateRoutingTable(RoutingUpdateEvent event) {
        // Logic to update the routing table, possibly involving adding, removing,
        // or modifying routes based on the event details.
    }

    // Method to route data to the next hop based on the destination IP address
    public void routeData(String ipAddress, String data) {
        Route route = routingTable.getRoute(ipAddress);
        if (route != null) {
            // Logic to send data to the next hop. This might involve
            // sending the data to the network interface associated with the route.
            NetworkInterface outInterface = findInterfaceByName(route.getInterface());
            if (outInterface != null) {
                outInterface.send(data, route.getGateway());
            } else {
                // Handle the case where the interface is not found
            }
        } else {
            // Handle the case where there is no route to the given IP address
        }
    }

    // Helper method to find a network interface by its name
    private NetworkInterface findInterfaceByName(String interfaceName) {
        Optional<NetworkInterface> matchingInterface = networkingInterface.stream()
            .filter(i -> i.getName().equals(interfaceName))
            .findFirst();
        return matchingInterface.orElse(null);
    }
}
