package factory;


import base.Building;
import base.Item;
import base.Person;
import base.Plant;
import base.animal.Animal;
import utils.Enum.PlantType;

public abstract class AbstractFactory {
    Plant createPlant(PlantType name){
        return null;
    }

    Animal createAnimal(String name){
        return null;
    }

    Item createItem(String name){
        return null;
    }

    Person createPerson(String name){ return null; }

    Building createBuilding(String name){
        return null;
    }
}
