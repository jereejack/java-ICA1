public class CamEntry {
    private String macAddress;
    private String port;

    public CamEntry(String macAddress, String port) {
        this.macAddress = macAddress;
        this.port = port;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
