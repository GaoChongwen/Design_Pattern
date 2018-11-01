package person;

import base.FarmObj;
import base.animal.Animal;
import base.plant.Plant;
import building.farmland.FarmLand;
import building.shed.AnimalHouse;
import utils.Enum.PlantType;

import java.util.ArrayList;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 *
 * Available operations for employee.
 *
 */
public interface EmployeeOperationAPI {
    /** slaughter a chosen animal in the shed. */
    public ArrayList<Animal> slaughter(AnimalHouse animalHouse);

    public boolean harvest(FarmLand farmLand, String tool);

    public boolean sowSeed(FarmLand farmLand, Plant plant);
}
