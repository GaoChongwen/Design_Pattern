package factory;


import base.Item;
import base.Plant;
import base.animal.Animal;
import building.farmland.FarmLand;
import person.Employee;
import utils.Enum.EmployeeSkill;
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

    FarmLand getFarmLand(FarmLandType type) {
        return null;
    }

    Employee createEmployee(String name, EmployeeSkill skill, float salary) { return null; }
}
