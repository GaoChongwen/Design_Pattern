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

    public void grow(Plant plant) {
        Random ra = new Random();

        int num = ra.nextInt(100);

        if (num < 10) {
            plant.setState(this);
        } else {
            plant.setState(GrowingState.getInstance());
        }
    }

    public void remove(Plant plant) {
        plant.setState(RemovedState.getInstance());
    }

    public void harvest(Plant plant) { }
}
