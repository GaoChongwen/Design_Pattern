package factory;


import base.Item;
import base.Person;
import base.plant.Plant;
import base.animal.Animal;
import building.farmland.FarmLand;
import propComp.props.landAdaptor.LandAdaptor;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

public abstract class AbstractFactory {
    Plant createPlant(String name) {
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

    FarmLand createFarmLand(String type) {
        return null;
    }

    LandAdaptor createAdaptor(String type) { return null; }
}
