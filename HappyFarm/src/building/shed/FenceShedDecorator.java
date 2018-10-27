package building.shed;

public class FenceShedDecorator extends ShedDecorator {

    private Shed shed;

    public FenceShedDecorator(Shed decoratedShed) {
        super(decoratedShed);
        shed = decoratedShed;

    }

    public void strongFence() {
        System.out.println("正在给" + shed.getName() + "加固篱笆...");
    }

    @Override
    public void bulidShed() {
        super.bulidShed();
        strongFence();
    }

    @Override
    public void done() {
        super.done();
    }
}
