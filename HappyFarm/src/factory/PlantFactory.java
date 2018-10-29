package factory;

import base.plant.Plant;
import java.util.Hashtable;
import java.util.Map;

/**
 * Design-Pattern: Factory Method, Prototype, Singleton
 *
 * @version 2018/10/28
 * @author lipeng liang
 *
 */
public class PlantFactory extends AbstractFactory {


    private volatile static PlantFactory singleton = new PlantFactory();
    private static Hashtable<String, Plant> plantMap = new Hashtable<String, Plant>();


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

    public void putPlant(Plant plant){
        System.out.println("in put plant");
        plantMap.put(plant.getType().toString(),plant);
    }

    public void getAllPlant(){

        for (Map.Entry<String, Plant> entry : plantMap.entrySet()) {
            System.out.println("PlantType = " + entry.getKey() + ", Plant = " + entry.getValue().getType());
        }

    }


}
