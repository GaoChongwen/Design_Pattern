package building.shed;
/**
 * @project: HappyFarm
 * @description: 测试使用场景：为动物的窝升级
 * @designPattern: Decorator
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        // 新建一个简陋的牛棚
        Shed cowShed = new CowShed("牛棚");
        cowShed.bulidShed();
        cowShed.done();

        // 给牛棚增加照明设备
        Shed cowShedWithLight = new LightShedDecorator(cowShed);
        cowShedWithLight.bulidShed();
        cowShedWithLight.done();

        // 给牛棚增加雨棚
        Shed cowShedWithCanopy = new CanopyShedDecorator(cowShed);
        cowShedWithCanopy.bulidShed();
        cowShedWithCanopy.done();

        // 新建一个简陋的鸡窝
        Shed chickShed = new ChickShed("鸡窝");
        chickShed.bulidShed();
        chickShed.done();

        // 为鸡窝加固篱笆
        Shed chickShedWithStrongFence = new FenceShedDecorator(chickShed);
        chickShedWithStrongFence.bulidShed();
        chickShedWithStrongFence.done();
    }
}
