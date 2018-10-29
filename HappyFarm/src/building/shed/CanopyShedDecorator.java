package building.shed;
/**
 * @project: HappyFarm
 * @description: 装饰器的实体类——雨棚装饰器
 * @designPattern: Decorator
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class CanopyShedDecorator extends ShedDecorator {

    // 被装饰的Shed对象
    private AnimalHouse shed;

    public CanopyShedDecorator(AnimalHouse decoratedShed) {
        super(decoratedShed);
        shed = decoratedShed;
    }

    // 安装雨棚
    public void buildCanopy() {
        System.out.println("正在给"+ shed.getName()+"搭建雨棚...");
    }

    // 搭建Shed并安装雨棚
    @Override
    public void bulidShed() {
        super.bulidShed();
        buildCanopy();
    }

    // 搭建完毕
    @Override
    public void done() {
        super.done();
    }
}
