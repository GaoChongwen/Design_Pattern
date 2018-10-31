package factory;

import base.plant.Plant;
import singleton.Farm;
import utils.Enum.DesignPatternMode;

import java.util.Hashtable;
import java.util.Map;

/**
 * Design-Pattern: Factory Method, Prototype
 * @description: 植物工厂类
 * @version 2018/10/28
 * @author lipeng liang
 *
 */
public class PlantFactory extends AbstractFactory {

    /**
     * @Design-Pattern: Singleton
     */
    private volatile static PlantFactory singleton = new PlantFactory();
    private static Hashtable<String, Plant> plantMap = new Hashtable<String, Plant>();
    private static DesignPatternMode designPattern = null;

    public static PlantFactory getInstance() {
        return singleton;
    }

    /**
     * @Design-Pattern: Factory Method, Prototype
     * @desprition:
     * @param type (String)：Plant的类型
     * @return  相应类型的Plant
     */

    @Override
    public Plant createPlant(String type) {
        Plant cachedPlant = plantMap.get(type);
        if (cachedPlant == null) {
                return null;
        }
        if(designPattern==DesignPatternMode.FactoryPattern){
            System.out.println("Factory Pattern | PlantFactory method: createdPlant(String) -> "+cachedPlant.getName()+" is created by PlantFactory");
        }
        return cachedPlant.clone();
    }

    public void putPlant(Plant plant)
    {
        if(designPattern==DesignPatternMode.FactoryPattern){
            System.out.println("Factory Pattern | PlantFactory method: putPlant(Plant) -> "+plant.getName()+" is put into PlantFactory.");
        }
        plantMap.put(plant.getName(),plant);
    }

    public boolean checkPlant(String plant){
        if(plantMap.get(plant)==null){
            return false;
        }
        return true;
    }


    public void getAllPlant(){

        for (Map.Entry<String, Plant> entry : plantMap.entrySet()) {
            System.out.println("Factory Pattern | PlantType = PlantFactory method: getAllPlant() -> we have " + entry.getKey() );
        }
    }

    public static void setDesignPattern(DesignPatternMode designPatter){
        designPattern=designPatter;
    }


}
