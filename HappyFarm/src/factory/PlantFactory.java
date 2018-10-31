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


    private volatile static PlantFactory singleton = new PlantFactory();
    private static Hashtable<String, Plant> plantMap = new Hashtable<String, Plant>();
    private DesignPatternMode designPattern = null;


    public static PlantFactory getInstance() {
        return singleton;
    }

    @Override
    public Plant createPlant(String type) {
        Plant cachedPlant = plantMap.get(type);
        if (cachedPlant == null) {
                return null;
        }
        return cachedPlant.clone();
    }

    public void putPlant(Plant plant)
    {
        if(designPattern==DesignPatternMode.FactoryPattern){
            System.out.println(plant.getName()+" is put into PlantFactory.");
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
            System.out.println("PlantType = " + entry.getKey() + ", Plant = " + entry.getValue().getType());
        }
    }

    public void setDesignPattern(DesignPatternMode designPattern){
        this.designPattern=designPattern;
    }


}
