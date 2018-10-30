package base.plant;

public class RemovedState implements PlantState {
    private volatile static RemovedState singleton = new RemovedState();

    private RemovedState() { }

    public static RemovedState getInstance() {
        return singleton;
    }

    public boolean plant(Plant plant) {
        return false;
    }

    public void grow(Plant plant) { }

    public boolean harvest(Plant plant) { return false;}

    public boolean process(Plant plant){ return false;}

}
