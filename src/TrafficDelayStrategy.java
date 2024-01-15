public class TrafficDelayStrategy extends XStrategy {
    public TrafficDelayStrategy(Connection connection) {
        super(connection);
    }

    @Override
    public void transmitData(String data) {

    }

    @Override
    public String receiveData() {
        return null;
    }
}
