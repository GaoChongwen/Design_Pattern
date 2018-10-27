package building.shed;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        // 新建一个简陋的牛棚
        Shed cowShed = new CowShed("牛棚");
        cowShed.bulidShed();
        cowShed.done();

        // 装修牛棚，增加照明设备
        Shed cowShedWithLight = new LightShedDecorator(cowShed);
        cowShedWithLight.bulidShed();
        cowShedWithLight.done();

        // 继续装修牛棚，增加雨棚
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
