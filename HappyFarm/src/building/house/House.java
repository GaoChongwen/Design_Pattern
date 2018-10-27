package building.house;

import base.Building;

public class House extends Building {
    private CoarseGrainedHouse cgh = new CoarseGrainedHouse();

    public void setInfo(String wallInfo, String doorInfo, String tileInfo, String windowInfo){
        cgh.setCpnInfo(wallInfo, doorInfo, tileInfo, windowInfo);
    }

    public String[] getInfo(){
        return cgh.getCpnInfo();
    }

    public void showHouse(){
        System.out.print("这个房子拥有：");
        for (int i = 0; i < cgh.getCpnInfo().length; i++) {
            System.out.print(cgh.getCpnInfo()[i] + " ");
        }
        System.out.print("\n");
    }
}
