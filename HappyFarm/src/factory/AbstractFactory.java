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
    public Plant createPlant(String name) {
        return null;
    }

    public Animal createAnimal(String name) {
        return null;
    }

    public Item createItem(String name) {
        return null;
    }
    
    public Employee createEmployee(String name, EmployeeSkill skill, float salary) { return null; }

    public FarmLand createFarmLand(String type) {
        return null;
    }

    public LandAdaptor createAdaptor(String type) { return null; }

    public Tool createTool(String name) { return null; }
}
