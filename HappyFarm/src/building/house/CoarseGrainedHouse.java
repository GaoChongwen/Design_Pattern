package building.house;

import building.house.HouseCpn.HouseDoor;
import building.house.HouseCpn.HouseTile;
import building.house.HouseCpn.HouseWall;
import building.house.HouseCpn.HouseWindow;
/**
 * @project: HappyFarm
 * @description: 房屋的粗粒度对象
 * @designPattern: Composite Entity Pattern
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class CoarseGrainedHouse {

    // 包含的依赖对象
    public HouseWall houseWall = new HouseWall();

    public HouseDoor houseDoor = new HouseDoor();

    public HouseTile houseTile = new HouseTile();

    public HouseWindow houseWindow = new HouseWindow();

    // 设置组件信息
    public void setCpnInfo(String wallInfo, String doorInfo, String tileInfo, String windowInfo){
       houseWall.setInfo(wallInfo);
       houseDoor.setInfo(doorInfo);
       houseTile.setInfo(tileInfo);
       houseWindow.setInfo(windowInfo);
    }

    // 获取组件信息
    public String[] getCpnInfo(){
        return new String[] {houseWall.getInfo(), houseDoor.getInfo(), houseTile.getInfo(), houseWindow.getInfo()};

    }
}
