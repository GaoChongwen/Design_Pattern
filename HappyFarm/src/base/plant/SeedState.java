package base.plant;

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

    // 种植: SeedState to GrowingState
    public boolean plant(Plant plant){
        plant.setState(GrowingState.getInstance());
        return true;
    }
    public void grow(Plant plant) { }

    public boolean harvest(Plant plant) { return false; }

    public boolean process(Plant plant){ return false;}

    public String getState(){return "种子状态";}


}
