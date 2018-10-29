package base.plant;

public class RemovedState implements PlantState {
    private volatile static RemovedState singleton = new RemovedState();

    private RemovedState() { }

    public static RemovedState getInstance() {
        return singleton;
    }

    public void grow(Plant plant) { }

    public void remove(Plant plant) { }

    public void harvest(Plant plant) { }
}
