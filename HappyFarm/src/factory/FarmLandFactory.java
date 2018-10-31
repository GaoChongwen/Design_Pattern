package factory;

import building.farmland.FarmLand;
import singleton.Farm;
import utils.Enum.DesignPatternMode;
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
    private static DesignPatternMode designPattern = null;

    public static FarmLandFactory getInstance() {
        return singleton;
    }

    @Override
    public FarmLand createFarmLand(String type) {
        FarmLand cachedFarmLand = FarmLandMap.get(type);
        if (cachedFarmLand == null) {
                return null;
        }
        if(designPattern==DesignPatternMode.FactoryPattern){
            System.out.println("Factory Pattern | FarmLandFactory method: createdFarmLand(String) -> "+cachedFarmLand.getName()+" is created by FarmLandFactory");
        }
        return cachedFarmLand.clone();
    }

    public void putFarmLand(FarmLand FarmLand) {

        if(designPattern==DesignPatternMode.FactoryPattern){
            System.out.println("Factory Pattern | FarmLandFactory method: putFarmLand(FarmLand) -> "+FarmLand.getName()+" is put into FarmLandFactory.");
        }
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
            System.out.println("Factory Pattern | FarmLandType = FarmLandFactory method: getAllFarmLand() -> we have " + entry.getKey());
        }

    }
    public static void setDesignPattern(DesignPatternMode designPatter){
        designPattern=designPatter;
    }


}
