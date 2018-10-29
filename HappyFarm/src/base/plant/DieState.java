package base.plant;

public class DieState implements PlantState{
    private volatile static DieState singleton = new DieState();

    private DieState() { }

    public static DieState getInstance() {
        return singleton;
    }

    public boolean plant(Plant plant) {
        return false;
    }

    public void grow(Plant plant){}

    public void remove(Plant plant) {
        plant.setState(RemovedState.getInstance());
    }

    public void harvest(Plant plant) {
    }
}
