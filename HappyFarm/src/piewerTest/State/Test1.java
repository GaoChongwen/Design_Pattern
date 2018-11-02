package piewerTest.State;

import plant.Apple;
import utils.Enum.FarmLandType;

public class Test1 {
    public static void main(String args[]) {

        System.out.println("状态模式");

        System.out.println("======\n种子");
        Apple a1 = new Apple();
        a1.state();
        System.out.println("======\n加工");
        a1.process();
        a1.state();
        System.out.println("======\n收获");
        a1.harvest();
        a1.state();
        System.out.println("======\n生长");
        a1.grow();
        a1.state();
        System.out.println("======\n种植");
        a1.plant(FarmLandType.appleField);
        a1.state();
        System.out.println("======\n生长");
        a1.grow();
        a1.state();
        System.out.println("======\n收获");
        a1.harvest();
        a1.state();
        System.out.println("======\n加工");
        a1.process();
        a1.state();





    }
}