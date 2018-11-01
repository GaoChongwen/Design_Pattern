package piewerTest.Facade;

import animal.Chicken;
import animal.Cow;
import base.animal.Animal;
import building.shed.ChickShed;
import building.shed.CowShed;
import plant.Apple;
import processSystem.ProcessMaker;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;

import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {
        Apple a = new Apple();
        a.plant(FarmLandType.appleField);
        a.grow();
        a.harvest();

        CowShed.getInstance().addAnimal(new Cow());
        CowShed.getInstance().feed();
        CowShed.getInstance().feed();
        CowShed.getInstance().feed();
        CowShed.getInstance().feed();


        ChickShed.getInstance().addAnimal(new Chicken());
        ChickShed.getInstance().feed();
        ChickShed.getInstance().feed();
        ChickShed.getInstance().feed();
        ChickShed.getInstance().feed();
        ChickShed.getInstance().feed();


        ArrayList<Animal> slaughterCows =CowShed.getInstance().slaughter();
        ArrayList<Animal> slaughterChick = ChickShed.getInstance().slaughter();

        // 设置设计模式
        ProcessMaker.getInstance().setDesignPattern(DesignPatternMode.FacadePattern);

        System.out.println("外观模式");
        System.out.println("====加工苹果");

        // 加工苹果
        ProcessMaker.getInstance().processPlant(a);

        System.out.println("====加工牛");
        // 加工牛
        for (Animal cow : slaughterCows){
            ProcessMaker.getInstance().processCow((Cow)cow);
        }

        System.out.println("====加工鸡");
        // 加工鸡
        for(Animal animal:slaughterChick){
            ProcessMaker.getInstance().processMeat(animal);
        }

    }

}
