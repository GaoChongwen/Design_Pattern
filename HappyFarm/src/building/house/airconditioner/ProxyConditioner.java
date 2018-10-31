package building.house.airconditioner;

/**
 * @project: HappyFarm
 * @scene: 空调遥控器
 * @designPattern: Proxy
 * @author: Jihao Luo
 * @date: 2018-10-30
 **/
public class ProxyConditioner implements AirConditioner {
    private RealConditioner realConditioner;
    @Override
    public void changeStatus() {
        if(realConditioner == null){
            realConditioner = new RealConditioner();
        }
        realConditioner.changeStatus();
    }

    @Override
    public void display() {
        if(realConditioner == null){
            realConditioner = new RealConditioner();
        }
        realConditioner.display();

    }
}
