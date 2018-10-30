package building.shed;
/**
 * @project: HappyFarm
 * @description: 装饰器的实体类——照明设备装饰器
 * @designPattern: Decorator
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class LightShedDecorator extends ShedDecorator {

    // 被装饰的shed对象
    private AnimalHouse shed;

    public LightShedDecorator(AnimalHouse decoratedShed) {
        super(decoratedShed);
        shed = decoratedShed;
    }

    // 安装照明设备
    public void installLight() {
        System.out.println("Installing lights for " + shed.getName());
    }

    // 搭建Shed并安装照明设备
    @Override
    public void bulidShed() {
        super.bulidShed();
        installLight();
    }

    // 搭建完毕
    @Override
    public void done() {
        super.done();
    }
}
