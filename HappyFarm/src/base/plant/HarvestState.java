package base.plant;

import java.util.Random;

/**
 * Design-Pattern: Singleton, Double checked locking, State
 *
 * @version 2018/10/28
 * @author lipeng liang
 *
 */

public class HarvestState implements PlantState {
    private volatile static HarvestState singleton = new HarvestState();

    private HarvestState() {

    }

    public static HarvestState getInstance() {
        return singleton;
    }

    public boolean plant(Plant plant) {
        return false;
    }

    public void grow(Plant plant) {
        plant.setState(RemovedState.getInstance());
    }

    public boolean harvest(Plant plant) {
        plant.setState(RemovedState.getInstance());
        return false;
    }

    // 加工: HarvestState to RemovedState
    public boolean process(Plant plant){
        plant.process(1);
        plant.setState(RemovedState.getInstance());
        return true;
    }

    public String getState(){return "已收获";}
}
