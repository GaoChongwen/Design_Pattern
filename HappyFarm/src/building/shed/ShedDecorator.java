package building.shed;
/**
 * @project: HappyFarm
 * @description: 实体装饰器的父类
 * @designPattern: Decorator
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class ShedDecorator extends Shed{

    protected Shed decoratedShed;

    public ShedDecorator(Shed decoratedShed){
        this.decoratedShed = decoratedShed;
    }

    @Override
    public void bulidShed() {
        System.out.println("========开始装修========");
    }

    @Override
    public void done() {
        System.out.println("装修完成。\n");
    }

}
