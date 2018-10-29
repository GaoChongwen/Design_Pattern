package base.plant;

import java.util.Random;

/**
 * Design-Pattern: Singleton, Double checked locking, State
 *
 * @version 2018/10/28
 * @author lipeng liang
 *
 */

public class MatureState implements PlantState {
    private volatile static MatureState singleton = new MatureState();

    private MatureState() {
    }

    public static MatureState getInstance() {
        return singleton;
    }

    public void grow(Plant plant) {
        Random ra = new Random();
        int num = ra.nextInt(100);
        if (num < 90) {
            plant.setState(this);
        } else {
            plant.setState(DieState.getInstance());
        }
    }

    public void remove(Plant plant) {
        plant.setState(RemovedState.getInstance());
    }

    public void harvest(Plant plant) {
        plant.harvest();
        plant.setState(HarvestState.getInstance());
    }
}
