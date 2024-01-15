import java.util.ArrayDeque;
import java.util.Queue;

public final class EventScheduler {

    private Queue<SimulationEvent> eventQueue;

    private static EventScheduler eventScheduler;



    private EventScheduler() {
        this.eventQueue = new ArrayDeque<SimulationEvent>();
    }



    public boolean isEventQueueEmpty(){
        return eventQueue.isEmpty();
    }

    public void addEventToQueue(SimulationEvent event){
        eventQueue.offer(event);
    }

    public void runEvent(){
        if (! eventQueue.isEmpty()){
            SimulationEvent currentEvent = eventQueue.poll();
            currentEvent.execute();
        }
    }

    public static EventScheduler getInstance() {
        if(eventScheduler == null){
            eventScheduler = new EventScheduler();
        }
        return eventScheduler;
    }
}
