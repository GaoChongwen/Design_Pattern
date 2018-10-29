package factory;

import building.farmland.FarmLand;
import utils.Enum.FarmLandType;

import java.util.Hashtable;
import java.util.Map;

/**
 * Design-Pattern: Factory Method, Prototype
 *
 * @author lipeng liang
 * @version 2018/10/28
 */
public class FarmLandFactory extends AbstractFactory {
    private volatile static FarmLandFactory singleton = new FarmLandFactory();
    private static Hashtable<FarmLandType, FarmLand> FarmLandMap = new Hashtable<FarmLandType, FarmLand>();


    public static FarmLandFactory getInstance() {
        return singleton;
    }

    @Override
    public FarmLand createFarmLand(FarmLandType type) {
        FarmLand cachedFarmLand = FarmLandMap.get(type);
        if (cachedFarmLand == null) {
            return null;
        }
        return cachedFarmLand.clone();
    }

    public void putFarmLand(FarmLand FarmLand) {
        System.out.println("in put FarmLand");
        FarmLandMap.put(FarmLand.getLandType(), FarmLand);
    }

    public void getAllFarmLand() {

        for (Map.Entry<FarmLandType, FarmLand> entry : FarmLandMap.entrySet()) {
            System.out.println("FarmLandType = " + entry.getKey() + ", FarmLand = " + entry.getValue().getLandType());
        }

    }

}
