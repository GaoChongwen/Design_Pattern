package person;

import base.FarmObj;
import base.animal.Animal;
import base.plant.Plant;
import building.farmland.FarmLand;
import building.shed.AnimalHouse;
import utils.Enum.PlantType;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 *
 * Available operations for employee.
 *
 */
public interface EmployeeOperationAPI {
    /** sow a seed in given farmland. */
//    public void sowSeed(int farmLand, Plant plant);

    /** harvest all plants in the land. */
    public void harvest();

    /** harvest a chosen plant in the land.*/
//    public void harvest(Plant plant);

    /** harvest a type of plants in the land. */
    public void harvest(String plantType);

    /** slaughter all animals in the shed. */
    public void slaughter();

    /** slaughter a chosen animal in the shed. */
    public void slaughter(Animal animal);

    /** slaughter a type a animals in the shed. */
//    public void slaughter(AnimalType animalType);

    /** water all farmlands. */
    public void water();

    /** water a chosen farmland. */
    public void water(FarmLand farmLand);

    public void harvest(FarmLand farmLand, String tool);

    public void killAnimals(AnimalHouse animalHouse);

    public void sowSeeds(FarmLand farmLand, Plant plant);
}
