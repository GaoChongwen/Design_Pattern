package test.factoryMethod;

import factory.PlantFactory;
import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import utils.Enum.DesignPatternMode;
import utils.Enum.PlantType;

/**
 * @project: HappyFarm
 * @scene: 植物工厂测试；现在创建一些新型植物，将这些植物挂载到植物工厂后，之后的植物均可从植物工厂中生产获取。
 *         注：实际上，所有植物可以先读配置表挂载于植物工厂中，之后可直接从工厂获取；
 *            商店中的植物也是由植物工厂提供，但此处测试不将商店作为中介获取植物。
 * @designPattern: FactoryMethod
 * @author: Lipeng Liang
 * @date: 2018-10-31
 **/

public class FactoryPatternDemo1 {
    public static void main(String args[]) {

        // 测试
        System.out.println("==========FactoryPatternDemo1========");
        System.out.println("Scene: Now we create some Plants, like Apple, Wheat, Rice, Cabbage, which will put itself into the PlantFactory."+
                "\nThen we will create those Plants from the Factory.");
        System.out.println("=====================================\n");

        // 设置DesignPatternMode,输出该模式相关信息
        PlantFactory.setDesignPattern(DesignPatternMode.FactoryPattern);

        System.out.println("1. Now we create somee Plants, like Apple, Wheat, Rice, Cabbage.\n");

        // 创建植物：苹果、小麦、卷心菜、水稻
        new Apple();
        new Cabbage();
        new Wheat();
        new Rice();

        System.out.println("=====\n");
        System.out.println("2. Now we can see what Plant in PlantFactory\n");

        // 查看工厂中的所有植物
        PlantFactory.getInstance().getAllPlant();

        System.out.println("=====\n");
        System.out.println("3. Now we use PlantFactory to create those plants\n");

        // 从工厂中创建植物
        Apple a = (Apple)PlantFactory.getInstance().createPlant(PlantType.apple.toString());
        Cabbage c = (Cabbage) PlantFactory.getInstance().createPlant(PlantType.cabbage.toString());
        Wheat w = (Wheat) PlantFactory.getInstance().createPlant(PlantType.wheat.toString());
        Rice r = (Rice) PlantFactory.getInstance().createPlant(PlantType.rice.toString());

        System.out.println("=====\n");
        System.out.println("Test Done.");

    }
}
