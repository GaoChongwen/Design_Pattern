package test.facade;

import animal.Chicken;
import animal.Cow;
import animal.Pig;
import base.animal.Animal;
import building.shed.ChickShed;
import building.shed.CowShed;
import plant.Apple;
import processSystem.ProcessMaker;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;

import java.util.ArrayList;

/**
 * @project: HappyFarm
 * @scene: 土地为AppleField类, 只可种植苹果(Apple), 无法种植小麦(Wheat),
 * 使用CornAdaptor, 使其除了种植苹果外，还可种植小麦，使用一次后失效；
 * @designPattern: Adaptor
 * @author: Lipeng Liang
 * @date: 2018-10-27
 **/
public class FacadePatternDemo {
    public static void main(String args[]) {

        // 初始化 获得可加工的动物与植物
        // 植物：需要种植、生长、收获后才可加工
        Apple a = new Apple();

        a.plant(FarmLandType.appleField);
        a.grow();
        a.harvest();

        // 动物：需要加入屋舍后：多次喂养至成熟态，并屠宰后才可加工
        // 牛舍..
        for(int i=0; i<1; ++i){
            CowShed.getInstance().addAnimal(new Cow());
        }
        CowShed.getInstance().feed();
        CowShed.getInstance().feed();
        CowShed.getInstance().feed();
        CowShed.getInstance().feed();
        ChickShed.getInstance().feed();
        ChickShed.getInstance().feed();

        // 鸡窝：
        for(int i=0; i<1; ++i){
            ChickShed.getInstance().addAnimal(new Chicken());
        }
        ChickShed.getInstance().feed();
        ChickShed.getInstance().feed();
        ChickShed.getInstance().feed();
        ChickShed.getInstance().feed();
        ChickShed.getInstance().feed();
        ChickShed.getInstance().feed();

        // 屠宰成熟态的动物，并返回屠宰好的动物，此时可加工
        ArrayList<Animal> slaughterCows =CowShed.getInstance().slaughter();
        ArrayList<Animal> slaughterChick = ChickShed.getInstance().slaughter();


        // 测试
        System.out.println("=====================FacadePatternDemo============================");
        System.out.println("Scene: Now Plants in our farm are mature.\n"+
                "Cows in Cowshed and Chick in ChickShed are slaughtered.\n"+
                "They can be put into the ProcessorMaker to process.");
        System.out.println("======================================================================\n");


        // 设置设计模式
        ProcessMaker.getInstance().setDesignPattern(DesignPatternMode.FacadePattern);

        System.out.println("1. Now ProcessorMaker process the Apple.\n");

        // 加工成熟的植物
        ProcessMaker.getInstance().processPlant(a);

        System.out.println("=====\n");
        System.out.println("2. Now ProcessorMaker process the Cows.\n");


        // 加工屠宰好的牛
        for (Animal cow : slaughterCows){
            ProcessMaker.getInstance().processCow((Cow)cow);
        }

        System.out.println("=====\n");
        System.out.println("3. Now ProcessorMaker process the Animals.\n");

        // 加工屠宰好的其它动物
        for(Animal animal:slaughterChick){
            ProcessMaker.getInstance().processMeat(animal);
        }

        System.out.println("=====\n");
        System.out.println("Test Done.");
    }
}
