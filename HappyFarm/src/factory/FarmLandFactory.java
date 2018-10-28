package factory;

import building.farmland.FarmLand;
import utils.Enum.FarmLandType;

import java.util.Hashtable;
import java.util.Map;
/**
 * Design-Pattern: Prototype, Factory
 *
 * @author lipeng liang
 * @version 2018/10/28
 */
public class FarmLandFactory extends AbstractFactory {
    private volatile static FarmLandFactory singleton = new FarmLandFactory();
    private static Hashtable<FarmLandType, FarmLand> farmLandMap = new Hashtable<FarmLandType, FarmLand>();

    public static FarmLandFactory getInstance() {
        return singleton;
    }

    @Override
    public FarmLand getFarmLand(FarmLandType type) {
        FarmLand cachedFarmLand = farmLandMap.get(type);
        if (cachedFarmLand == null) {
            return null;
        }
        return cachedFarmLand.clone();
    }

    public void putFarmLand(FarmLand farmLand) {
        farmLandMap.put(farmLand.getType(), farmLand);
        System.out.println(farmLand.getPrice() + " is put into FarmLandFactory success!");
    }

    public void getAllFarmLand(){
        for(Map.Entry<FarmLandType,FarmLand> entry:farmLandMap.entrySet()){
            System.out.println("FarmLandType is " + entry.getKey() + ", FarmLand is " + entry.getValue().getType());
        }
    }
    public void rmvFarmLand(FarmLand farmLand) {

        if (null==farmLandMap.remove(farmLand.getType())) {
            System.out.println("remove success!");
        }else {
            System.out.println("remove fail!");
        }
    }
}
