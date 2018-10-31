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

    public boolean plant(Plant plant) {
        return false;
    }

    // 生长: 80% 可能性生长为MatureState
    public void grow(Plant plant) {
        Random ra = new Random();
        int num = ra.nextInt(100);
        if (num > 20) {
            plant.setState(MatureState.getInstance());
        }
    }

    public boolean harvest(Plant plant) { return false;}
    public boolean process(Plant plant){ return false;}

}
