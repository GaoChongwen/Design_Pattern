package factory;

import base.Plant;
import utils.Enum.PlantType;

import java.util.Hashtable;
import java.util.Map;

/**
 * Design-Pattern: Factory Method, Prototype
 *
 * @author lipeng liang
 * @version 2018/10/28
 */
public class PlantFactory extends AbstractFactory {


    private volatile static PlantFactory singleton = new PlantFactory();
    private static Hashtable<PlantType, Plant> plantMap = new Hashtable<PlantType, Plant>();


    public static PlantFactory getInstance() {
        return singleton;
    }

    @Override
    public Plant createPlant(PlantType type) {
        Plant cachedPlant = plantMap.get(type);
        if (cachedPlant == null) {
            return null;
        }
        return cachedPlant.clone();
    }

    public void putPlant(Plant plant) {
        plantMap.put(plant.getType(), plant);
        System.out.println(plant.getType() + " is put into PlantFactory success!");
    }

    public void getAllPlant() {

        for (Map.Entry<PlantType, Plant> entry : plantMap.entrySet()) {
            System.out.println("PlantType is " + entry.getKey() + ", Plant is " + entry.getValue().getType());
        }

    }

    public void rmvPlant(Plant plant) {

        if (null==plantMap.remove(plant.getType())) {
            System.out.println("remove success!");
        }else {
            System.out.println("remove fail!");
        }
    }


}
