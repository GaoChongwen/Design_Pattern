package building.house;

import building.house.HouseCpn.HouseDoor;
import building.house.HouseCpn.HouseTile;
import building.house.HouseCpn.HouseWall;
import building.house.HouseCpn.HouseWindow;

public class CoarseGrainedHouse {

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
