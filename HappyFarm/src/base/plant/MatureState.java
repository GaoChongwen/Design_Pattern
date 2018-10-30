package base.plant;

import java.util.Random;

/**
 * @Project: HappyFarm
 * @description: MatureState records state of plant
 * @Design-Pattern: Singleton, Double checked locking, State
 * @version 2018/10/28
 * @author lipeng liang
 */

public class MatureState implements PlantState {
    private volatile static MatureState singleton = new MatureState();

    private MatureState() {
    }

    public static MatureState getInstance() {
        return singleton;
    }

    // 生长: 无法生长
    public void grow(Plant plant) { }

    public boolean plant(Plant plant) {
        return false;
    }

    // 收获: MatureState to RemovedState
    public boolean harvest(Plant plant) {
        plant.harvest(1);
        plant.setState(RemovedState.getInstance());
        return true;
    }

    // 加工: MatureState to RemovedState
    public void process(Plant plant){
        plant.process(1);
        plant.setState(RemovedState.getInstance());
    }

}
