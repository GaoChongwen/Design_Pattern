package building.shed;

public class LightShedDecorator extends ShedDecorator {

    private Shed shed;

    public LightShedDecorator(Shed decoratedShed) {
        super(decoratedShed);
        shed = decoratedShed;
    }

    public void installLight() {
        System.out.println("正在给" + shed.getName() + "安装照明设备...");
    }

    @Override
    public void bulidShed() {
        super.bulidShed();
        installLight();
    }

    @Override
    public void done() {
        super.done();
    }
}
