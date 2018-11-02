package piewerTest.FactoryMethod;

import factory.PlantFactory;
import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import utils.Enum.DesignPatternMode;
import utils.Enum.PlantType;

public class Test {
    public static void main(String args[]) {

        System.out.println("工厂模式");
        PlantFactory.setDesignPattern(DesignPatternMode.FactoryPattern);

        System.out.println("创建植物，挂载植物");
        new Apple();
        new Cabbage();
        new Wheat();
        new Rice();


        PlantFactory.getInstance().getAllPlant();

        System.out.println("从工厂创建植物");
        Apple a = (Apple)PlantFactory.getInstance().createPlant(PlantType.apple.toString());
        Cabbage c = (Cabbage) PlantFactory.getInstance().createPlant(PlantType.cabbage.toString());
        Wheat w = (Wheat) PlantFactory.getInstance().createPlant(PlantType.wheat.toString());
        Rice r = (Rice) PlantFactory.getInstance().createPlant(PlantType.rice.toString());


    }

}
