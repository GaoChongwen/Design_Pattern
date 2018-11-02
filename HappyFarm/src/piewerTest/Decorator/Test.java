package piewerTest.Decorator;

import base.animal.Animal;
import building.shed.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("====== Test Decorator Pattern ======");
        System.out.println("goal: to upgrade the Animal House\n");

        /*
        以下是对牛棚的升级
         */
        //新建一个简陋的牛棚
        AnimalHouse cowShed = CowShed.getInstance();
        cowShed.bulidShed();
        cowShed.done();

        //给牛棚增加照明设备
        AnimalHouse cowShedWithLight = new LightShedDecorator(cowShed);
        cowShedWithLight.bulidShed();
        cowShedWithLight.done();

        //给牛棚增加雨棚
        AnimalHouse cowShedWithCanopy = new CanopyShedDecorator(cowShed);
        cowShedWithCanopy.bulidShed();
        cowShedWithCanopy.done();

        //给牛棚加固篱笆
        AnimalHouse fenceShedDecorator = new FenceShedDecorator(cowShed);
        fenceShedDecorator.bulidShed();
        fenceShedDecorator.done();

        /*
        以下是对鸡舍的升级
         */
        //新建一个简陋的鸡舍
        AnimalHouse chickShed = ChickShed.getInstance();
        chickShed.bulidShed();
        chickShed.done();

        //为鸡舍增加照明设备
        AnimalHouse lightShedDecorator = new LightShedDecorator(chickShed);
        lightShedDecorator.bulidShed();
        lightShedDecorator.done();

        //为鸡舍增加雨棚
        AnimalHouse canopyShedDecorator = new CanopyShedDecorator(chickShed);
        canopyShedDecorator.bulidShed();
        canopyShedDecorator.done();

        //为鸡舍加固篱笆
        AnimalHouse chickShedWithStrongFence = new FenceShedDecorator(chickShed);
        chickShedWithStrongFence.bulidShed();
        chickShedWithStrongFence.done();
    }
}
