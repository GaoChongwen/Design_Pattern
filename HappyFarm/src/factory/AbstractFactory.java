package factory;


import base.Item;

import base.animal.Animal;
import base.plant.Plant;
import building.farmland.FarmLand;

import person.Employee;
import utils.Enum.EmployeeSkill;

import propComp.props.landAdaptor.LandAdaptor;

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
    
    Employee createEmployee(String name, EmployeeSkill skill, float salary) { return null; }


    FarmLand createFarmLand(FarmLandType type) {
        return null;
    }

    LandAdaptor createAdaptor(FarmLandType type) { return null; }

}
