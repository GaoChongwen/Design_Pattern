package singleton;

import base.FarmObj;
import plant.Apple;
import utils.Enum.PlantType;

public class Farm extends FarmObj {
    private volatile static Farm singleton = new Farm();
    public static Farm getInstance() { return singleton; }

    private Farm(){

    }

    // 初始化植物
    private void initialPlant(){
        new Apple();
    }

    private void initialPorps(){

    }

    private void initialBuilding(){

    }


}
