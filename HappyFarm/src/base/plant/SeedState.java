package base.plant;

import java.util.Random;

/**
 * Design-Pattern: Singleton, Double checked locking, State
 *
 * @author lipeng liang
 * @version 2018/10/28
 */

public class SeedState implements PlantState {
    private volatile static SeedState singleton = new SeedState();

    private SeedState() { }

    public static SeedState getInstance() {
        return singleton;
    }

    public boolean plant(Plant plant){
        plant.setState(GrowingState.getInstance());
        return true;
    }
    public void grow(Plant plant) { }

    public void remove(Plant plant) {
        plant.setState(RemovedState.getInstance());
    }

    public void harvest(Plant plant) { }
}
