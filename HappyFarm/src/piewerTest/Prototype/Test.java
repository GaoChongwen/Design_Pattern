package piewerTest.Prototype;

import factory.PlantFactory;
import plant.Wheat;
import utils.Enum.DesignPatternMode;
import utils.Enum.PlantType;

public class Test {
    public static void main(String args[]) {
        System.out.println("原型模式");
        PlantFactory.setDesignPattern(DesignPatternMode.PrototypePattern);
        Wheat w = new Wheat();
        w.setDesignPattern(DesignPatternMode.PrototypePattern);
        Wheat w1 = (Wheat) PlantFactory.getInstance().createPlant(PlantType.wheat.toString());

    }
}
