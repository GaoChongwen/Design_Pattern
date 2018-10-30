package building.shed;
/**
 * @project: HappyFarm
 * @description: 实体装饰器的父类
 * @designPattern: Decorator
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class ShedDecorator extends AnimalHouse{

    protected AnimalHouse decoratedShed;

    public ShedDecorator(AnimalHouse decoratedShed){
        this.decoratedShed = decoratedShed;
    }

    @Override
    public void bulidShed() {
        System.out.println("========Start decorating...========");
    }

    @Override
    public void done() {
        System.out.println("Done.\n");
    }

}
