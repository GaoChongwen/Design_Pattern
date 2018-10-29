package utils.state.plantState;

import base.Plant;

import java.util.Random;

/**
 * Design-Pattern: Singleton, Double checked locking, State
 *
 * @version 2018/10/28
 * @author lipeng liang
 *
 */

public class SeedState implements PlantState {
    private volatile static SeedState singleton = new SeedState();

    private SeedState() {
    }

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
}
