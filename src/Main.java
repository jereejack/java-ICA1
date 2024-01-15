// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }


        class NetworkInterface {
            private String id;
            private String ipAddress;
            private boolean isConnected;
            private String mask;

            NetworkInterface() {
            }
        }

        class RoutingTable {
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

        class Route {
            private String ipAddress;
            private String netmask;
            private String gateway;
            private String interfaceName;
        }

        class Protocol {
            private List<Logger> loggers;

            public Protocol() {
                this.loggers = new ArrayList<>();
            }

            public void registerLogger(Logger logger) {
                loggers.add(logger);
            }
        }

        class IPV4 extends Protocol {
        }

        class IPV6 extends Protocol {
        }

        class Device {
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

        class Logger {
            private static Logger instance;

            private Logger() {
            }

            public static Logger getInstance() {
                if (instance == null) {
                    instance = new Logger();
                }
                return instance;
            }

            public void logInformation(String message){
            }

            public void logDebugInformation(String message){
            }

            public void logErrorMessage(String message){
            }

            public void setLogLevel(LogLevel logLevel){
            }

            public String logFormatting(String message){
                return message;
            }

            public void registerObserver(Observer observer){
            }
        }

        enum LogLevel {
        }

        interface Observer {
        }

        class Event {
        }

    }
}