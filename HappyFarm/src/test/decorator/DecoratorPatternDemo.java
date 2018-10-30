package test.decorator;

import building.shed.*;

/**
 * @project: HappyFarm
 * @description: 测试使用场景：为动物的窝升级
 * @designPattern: Decorator
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        System.out.println("======= Test Decorator Pattern =======");
        System.out.println("====== Upgrade the Animal House ======");

        // 新建一个简陋的牛棚
        AnimalHouse cowShed = CowShed.getInstance();
        cowShed.bulidShed();
        cowShed.done();

        // 给牛棚增加照明设备
        AnimalHouse cowShedWithLight = new LightShedDecorator(cowShed);
        cowShedWithLight.bulidShed();
        cowShedWithLight.done();

        // 给牛棚增加雨棚
        AnimalHouse cowShedWithCanopy = new CanopyShedDecorator(cowShed);
        cowShedWithCanopy.bulidShed();
        cowShedWithCanopy.done();

        // 新建一个简陋的鸡窝
        AnimalHouse chickShed = ChickShed.getInstance();
        chickShed.bulidShed();
        chickShed.done();

        // 为鸡窝加固篱笆
        AnimalHouse chickShedWithStrongFence = new FenceShedDecorator(chickShed);
        chickShedWithStrongFence.bulidShed();
        chickShedWithStrongFence.done();
    }
}
