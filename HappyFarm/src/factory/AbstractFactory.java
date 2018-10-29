package factory;


import base.Item;
import base.Person;
import base.plant.Plant;
import base.animal.Animal;
import building.farmland.FarmLand;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

public abstract class AbstractFactory {
    Plant createPlant(PlantType name) {
        return null;
    }

    Animal createAnimal(String name) {
        return null;
    }

    Item createItem(String name) {
        return null;
    }

    Person createPerson(String name) {
        return null;
    }

    FarmLand getFarmLand(FarmLandType type) {
        return null;
    }
}
