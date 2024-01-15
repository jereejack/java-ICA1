public class SimulationEvent {

    private long timeStamp;
    private EventType eventType;
    private String details;

    public SimulationEvent(long timeStamp, EventType eventType, String details) {
        this.timeStamp = timeStamp;
        this.eventType = eventType;
        this.details = details;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
