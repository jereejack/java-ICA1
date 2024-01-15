public interface SimulationCore {

    void initialize();
    void terminate();
    void registerLogger(Logger logger);
    void start();
    void stop();
    void setEnvironmentalEffectsStrategy(EnvironmentalEffectsStrategy);
    void setTrafficDelayStrategy(TrafficDelayStrategy);

}
