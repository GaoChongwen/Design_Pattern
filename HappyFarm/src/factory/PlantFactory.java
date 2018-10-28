package factory;

import base.Plant;
import utils.Enum.PlantType;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

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

    public void putPlant(Plant plant){
        plantMap.put(plant.getType(),plant);
    }

    public void getAllPlant(){

        for (Map.Entry<PlantType, Plant> entry : plantMap.entrySet()) {
            System.out.println("PlantType = " + entry.getKey() + ", Plant = " + entry.getValue().getType());
        }

    }


}
