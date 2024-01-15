import java.util.List;
import java.util.ArrayList;

public class RoutingTable {
    private List<Route> routes;

    public RoutingTable() {
        this.routes = new ArrayList<>();
    }

    // Method to add a route to the routing table
    public void addRoute(Route route) {
        routes.add(route);
    }

    // Method to remove a route from the routing table
    public void removeRoute(Route route) {
        routes.remove(route);
    }

    // Method to get a route for a specific destination IP address
    public Route getRouteForDestination(String ipAddress) {
        for (Route route : routes) {
            if (route.matchesDestination(ipAddress)) {
                return route;
            }
        }
        return null; // No route found for the given IP address
    }


}
