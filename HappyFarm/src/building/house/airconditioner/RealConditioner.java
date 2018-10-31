package building.house.airconditioner;

/**
 * @project: HappyFarm
 * @scene: 真空调
 * @designPattern: Proxy
 * @author: Jihao Luo
 * @date: 2018-10-30
 **/
public class RealConditioner implements AirConditioner {
    private String status= "off";
    @Override
    public void changeStatus() {
        if (status.equals("off")) status = "on";
        else {
            status="off";
        }
    }

    public void display() {
        System.out.println(this.status);
    }
}
