package building.house.HouseCpn;

/**
 * @project: HappyFarm
 * @description: 房屋的依赖对象——窗
 * @designPattern: Composite Entity Pattern
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class HouseWindow {

    private String info;

    // 默认是推拉窗

    public HouseWindow() {
        info = "PushableWindow";
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
