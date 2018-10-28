package building.shed;
/**
 * @project: HappyFarm
 * @description: 装饰器的实体类——篱笆装饰器
 * @designPattern: Decorator
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class FenceShedDecorator extends ShedDecorator {

    // 被装饰的shed对象
    private Shed shed;

    public FenceShedDecorator(Shed decoratedShed) {
        super(decoratedShed);
        shed = decoratedShed;

    }

    // 加固篱笆
    public void strongFence() {
        System.out.println("正在给" + shed.getName() + "加固篱笆...");
    }

    // 搭建Shed并加固篱笆
    @Override
    public void bulidShed() {
        super.bulidShed();
        strongFence();
    }

    // 搭建完成
    @Override
    public void done() {
        super.done();
    }
}
