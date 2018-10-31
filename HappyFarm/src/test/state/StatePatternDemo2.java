package test.state;

import building.farmland.AppleField;
import plant.Apple;
import utils.Enum.FarmLandType;

import java.util.ArrayList;

/**
 * @project: HappyFarm
 * @scene: 种植植物后；植物有：SeedState, GrowingState, MatureState, HarvestState与RemovedState状态；
 * 种植后由SeedState至GrowingState;
 * 生长后由GrowingState至MatureState;
 * 收获后由MatureState至HarvestState;
 * 加工或生长后由HarvestState至RemovedState.
 * @designPattern: State
 * @author: Lipeng Liang
 * @date: 2018-10-27
 **/

public class StatePatternDemo2 {
    public static void main(String args[]) {

        // 测试
        System.out.println("==========StatePatternDemo2========");
        System.out.println("Scene: Plants have: SeedState, GrowingState, MatureState, HarvestState and RemovedState.),\n"+
                "After planting : SeedState to GrowingState;\n"+
                "After growing : GrowingState to MatureState;\n" +
                "After harvesting : MatureState to HarvestState;\n"+
                "After processing or growing : HarvestState to RemovedState.");
        System.out.println("=====================================\n");

        // 初始化
        Apple a1 = new Apple();

        System.out.println("1. Now we get a appleSeed.\n");
        // 输出：均为种子态
        a1.state();

        System.out.println("=====\n");
        System.out.println("2. Now we plant the appleSeed.\n");

        // 种植a1
        a1.plant(FarmLandType.appleField);

        // 输出：a1生长态
        a1.state();

        System.out.println("=====\n");
        System.out.println("3. Now we grow the appleSeed.\n");

        // 生长a1
        a1.grow();

        // 输出：a1成熟态
        a1.state();

        System.out.println("=====\n");
        System.out.println("3. Now we harvest the apple.\n");

        // 收获
        a1.harvest();

        // 输出：a1收获态
        a1.state();

        System.out.println("=====\n");
        System.out.println("3. Now we process the apple.\n");

        // 加工
        a1.process();

        // 输出：a1移除态
        a1.state();

        System.out.println("=====\n");
        System.out.println("Test Done.");
    }
}
