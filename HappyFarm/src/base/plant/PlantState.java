package base.plant;

/**
 * @Project: HappyFarm
 * @description: 植物状态接口
 * @Design-Pattern: State
 * @author lipeng liang
 * @version 2018/10/28
 */

public interface PlantState {

    // 种植:SeedState to GrowingState
    public boolean plant(Plant plant);

    // 生长:GrowingState to MatureState
    public void grow(Plant plant);

    // 收获:MatureState to RemovedState
    public boolean harvest(Plant plant);

    // 加工:MatureState to RemovedState
    public boolean process(Plant plant);

}
