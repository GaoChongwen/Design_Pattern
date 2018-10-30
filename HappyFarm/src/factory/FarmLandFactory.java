package factory;

import building.farmland.FarmLand;
import singleton.Farm;
import utils.Enum.FarmLandType;

import java.util.Hashtable;
import java.util.Map;

/**
 * Design-Pattern: Factory Method, Prototype
 * @description: 土地工厂类
 * @author lipeng liang
 * @version 2018/10/28
 */
public class FarmLandFactory extends AbstractFactory {
    private volatile static FarmLandFactory singleton = new FarmLandFactory();
    private static Hashtable<String, FarmLand> FarmLandMap = new Hashtable<String, FarmLand>();

    public static FarmLandFactory getInstance() {
        return singleton;
    }

    @Override
    public FarmLand createFarmLand(String type) {
        FarmLand cachedFarmLand = FarmLandMap.get(type);
        if (cachedFarmLand == null) {
                return null;
        }
        return cachedFarmLand.clone();
    }

    public void putFarmLand(FarmLand FarmLand) {
        FarmLandMap.put(FarmLand.getName(), FarmLand);
    }

    public boolean checkFarmLand(String land){
        if(FarmLandMap.get(land)==null){
            return false;
        }
        return true;
    }

    public void getAllFarmLand() {

        for (Map.Entry<String, FarmLand> entry : FarmLandMap.entrySet()) {
            System.out.println("FarmLandType = " + entry.getKey() + ", FarmLand = " + entry.getValue().getLandType());
        }

    }

}
