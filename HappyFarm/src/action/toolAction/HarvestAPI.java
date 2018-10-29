package action.toolAction;


import utils.Enum.PlantType;
import base.plant.Plant;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Bridge
 */
public interface HarvestAPI {
    public boolean harvest(PlantType plantType);
    public boolean harvest();
    public boolean harvestWheat();
}
