package building.shed;

public class CanopyShedDecorator extends ShedDecorator {
    private Shed shed;

    public CanopyShedDecorator(Shed decoratedShed) {
        super(decoratedShed);
        shed = decoratedShed;
    }

    public void buildCanopy() {
        System.out.println("正在给"+ shed.getName()+"搭建雨棚...");
    }

    @Override
    public void bulidShed() {
        super.bulidShed();
        buildCanopy();
    }

    @Override
    public void done() {
        super.done();
    }
}
