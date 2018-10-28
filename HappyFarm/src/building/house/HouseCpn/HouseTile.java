package building.house.HouseCpn;
/**
 * @project: HappyFarm
 * @description: 房屋的依赖对象——瓦
 * @designPattern: Composite Entity Pattern
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class HouseTile {

    private String info;

    // 默认是青瓦
    public HouseTile() {
        info = "青瓦";
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
