package base.plant;

import java.util.Random;

/**
 * Design-Pattern: Singleton, Double checked locking, State
 *
 * @version 2018/10/28
 * @author lipeng liang
 *
 */

public class GrowingState implements PlantState {
    private volatile static GrowingState singleton = new GrowingState();

    private GrowingState() {

    }

    public static GrowingState getInstance() {
        return singleton;
    }

    public void grow(Plant plant) {
        Random ra = new Random();
        int num = ra.nextInt(100);
        if (num < 20) {
            plant.setState(this);
        } else {
            plant.setState(MatureState.getInstance());
        }
    }

    public void remove(Plant plant) {
        plant.setState(RemovedState.getInstance());
    }

    public void harvest(Plant plant) {

    }
}
