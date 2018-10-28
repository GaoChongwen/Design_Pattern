package building.shed;

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
