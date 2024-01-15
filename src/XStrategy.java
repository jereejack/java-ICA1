public abstract class XStrategy extends Connection {
    private Connection connection;

    public XStrategy (Connection connection) {this.connection = connection;}
    public Connection getConnection() {return connection;}
}
