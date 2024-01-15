import java.io.File;

public class SimulationCoreConcrete implements SimulationCore{

    private Logger logger;

    private EnvironmentalEffectsStrategy environmentalEffectsStrategy;
    private TrafficDelayStrategy trafficDelayStrategy;

    private File topology;


    public SimulationCoreConcrete(File topology, EnvironmentalEffectsStrategy environmentalEffectStrategy, TrafficDelayStrategy trafficDelayStrategy) {
        this.topology = topology;
        this.environmentalEffectsStrategy = environmentalEffectStrategy;
        this.trafficDelayStrategy = trafficDelayStrategy;
    }



    @Override
    public void initialize() {
       registerLogger(logger);
       setEnvironmentalEffectsStrategy(environmentalEffectsStrategy);
       setTrafficDelayStrategy(trafficDelayStrategy);
       System.out.println("initialized  the simulator");
       start();
    }

    @Override
    public void terminate() {
        System.out.println("Terminating the simulator");
        stop();
    }

    @Override
    public void registerLogger(Logger logger) {
       this.logger = logger;
    }

    @Override
    public void start() {
        EventScheduler eventScheduler = EventScheduler.getInstance();
        eventScheduler.addEventToQueue(new SimulationEvent((long) 0.0,EventType.START,"Starting simulation"));
        eventScheduler.runEvent();
    }

    @Override
    public void stop() {
    }

    @Override
    public void setEnvironmentalEffectsStrategy(EnvironmentalEffectsStrategy environmentalEffectsStrategy) {
        this.environmentalEffectsStrategy = environmentalEffectsStrategy;
    }

    @Override
    public void setTrafficDelayStrategy(TrafficDelayStrategy trafficDelayStrategy) {
        this.trafficDelayStrategy = trafficDelayStrategy;
    }


    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public EnvironmentalEffectsStrategy getEnvironmentalEffectsStrategy() {
        return environmentalEffectsStrategy;
    }



    public TrafficDelayStrategy getTrafficDelayStrategy() {
        return trafficDelayStrategy;
    }



    public File getTopology() {
        return topology;
    }

    public void setTopology(File topology) {
        this.topology = topology;
    }
}
