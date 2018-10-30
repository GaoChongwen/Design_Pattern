package factory;


import base.Item;

import base.animal.Animal;
import base.plant.Plant;
import building.farmland.FarmLand;

import person.Employee;
import propComp.tools.Tool;
import utils.Enum.EmployeeSkill;

import propComp.props.landAdaptor.LandAdaptor;

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

    Employee createEmployee(String name, EmployeeSkill skill, float salary) { return null; }

    FarmLand createFarmLand(String type) {}
    Produce createProduce(String name){
        return null;
    }

    FarmLand createFarmLand(FarmLandType type) {
        return null;
    }

    LandAdaptor createAdaptor(String type) { return null; }

    Tool createTool(String name) { return null; }

    Produce createProduce(String name) {
        return null;
    }

}
