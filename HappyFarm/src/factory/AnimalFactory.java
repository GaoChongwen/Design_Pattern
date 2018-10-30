package factory;

import animal.Chicken;
import animal.Cow;
import animal.Pig;
import base.animal.Animal;
import base.plant.Plant;

import java.util.Hashtable;

public class AnimalFactory extends AbstractFactory {
    private volatile static PlantFactory singleton = new PlantFactory();

    public static PlantFactory getInstance() {
        return singleton;
    }
    @Override
    public Animal createAnimal(String name) {
        if(name.equals("cow")){
            return new Cow();
        }
        else if(name.equals("chicken")){
            return new Chicken();
        }
        else if(name.equals("pig")){
            return new Pig();
        }
        else{
            return null;
        }
    }
}
