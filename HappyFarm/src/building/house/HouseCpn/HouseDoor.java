package building.house.HouseCpn;

//import building.house.HouseCpnColor;
/**
 * @project: HappyFarm
 * @description: 房屋的依赖对象——门
 * @designPattern: Composite Entity Pattern
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class HouseDoor {

    private String info;

    // 默认是木质门
    public HouseDoor() {
        info = "WoodenDoor";
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
