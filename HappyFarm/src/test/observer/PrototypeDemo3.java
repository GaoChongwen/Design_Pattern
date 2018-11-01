package test.observer;

import factory.PlantFactory;
import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import utils.Enum.DesignPatternMode;
import utils.Enum.PlantType;

public class PrototypeDemo3 {
    public static void main(String args[]) {

        System.out.println("==========Prototype_DEMO3========");
        System.out.println("Scene: After we create Apple, Wheat, Rice, Cabbage, we can get new plant by cloning the prototype.\n");

        System.out.println("1. Now we create some Plants, like Apple, Wheat, Rice, Cabbage.\n");
        PlantFactory.setDesignPattern(DesignPatternMode.PrototypePattern);

        // 创建植物：苹果、小麦、卷心菜、水稻
        Cabbage c = new Cabbage();
        Wheat w = new Wheat();
        Rice r = new Rice();
        Apple a = new Apple();

        // 设置原型模式
        a.setDesignPattern(DesignPatternMode.PrototypePattern);
        c.setDesignPattern(DesignPatternMode.PrototypePattern);
        w.setDesignPattern(DesignPatternMode.PrototypePattern);
        r.setDesignPattern(DesignPatternMode.PrototypePattern);

        System.out.println("=====\n");
        System.out.println("2. Now we can create those Plant by Cloning.");
        System.out.println("2.1 create Apple by cloning");
        PlantFactory.getInstance().createPlant(PlantType.apple.toString());

        System.out.println("2.2 create Cabbage by cloning");
        PlantFactory.getInstance().createPlant(PlantType.cabbage.toString());
        System.out.println("2.3 create Wheat by cloning");
        PlantFactory.getInstance().createPlant(PlantType.wheat.toString());
        System.out.println("2.4 create Rice by cloning");
        PlantFactory.getInstance().createPlant(PlantType.rice.toString());
        System.out.println("=====\n");
        System.out.println("Test Done.");



    }
}
