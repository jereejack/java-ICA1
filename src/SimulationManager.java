import java.io.File;

public class SimulationManager {

    SimulationCoreConcrete simulationCoreConcrete;

    File simulationTopology;


    public SimulationManager() {
    }

    public void runSimulation(File simulationTopology, EnvironmentalEffectsStrategy environmentalEffectStrategy, TrafficDelayStrategy trafficDelayStrategy){
        simulationCoreConcrete = new SimulationCoreConcrete(simulationTopology, environmentalEffectStrategy, trafficDelayStrategy);
        simulationCoreConcrete.initialize();
    }

    public void stopSimulation(){
      simulationCoreConcrete.terminate();
    }

    public SimulationCoreConcrete getSimulationCoreConcrete() {
        return simulationCoreConcrete;
    }

    public void setSimulationCoreConcrete(SimulationCoreConcrete simulationCoreConcrete) {
        this.simulationCoreConcrete = simulationCoreConcrete;
    }

    public File getSimulationTopology() {
        return simulationTopology;
    }

    public void setSimulationTopology(File simulationTopology) {
        this.simulationTopology = simulationTopology;
    }
}
