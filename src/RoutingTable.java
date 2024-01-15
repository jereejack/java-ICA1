import java.util.ArrayList;
import java.util.List;

public class RoutingTable {

    private List<Route> routes;

    public RoutingTable() {
        this.routes = new ArrayList<>();
    }

    public void addRoute(Route route) {
        routes.add(route);
    }

    public Route getRoute(String ipAddress) {
        return null;
    }
}
