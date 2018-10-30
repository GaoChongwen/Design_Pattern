package building.house.HouseCpn;

/**
 * @project: HappyFarm
 * @description: 房屋的依赖对象——墙
 * @designPattern: Composite Entity Pattern
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class HouseWall {

    private String info;

    // 默认是灰墙
    public HouseWall() {
        info = "GrayWall";
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
