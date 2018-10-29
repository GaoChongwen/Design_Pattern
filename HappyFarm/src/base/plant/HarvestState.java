package base.plant;

public class HarvestState implements PlantState {
    private volatile static HarvestState singleton = new HarvestState();

    private HarvestState() { }

    public static HarvestState getInstance() {
        return singleton;
    }

    public boolean plant(Plant plant) {
        return false;
    }

    public void grow(Plant plant){ }

    public void remove(Plant plant) {
        plant.setState(RemovedState.getInstance());
    }

    public void harvest(Plant plant) { }
}
