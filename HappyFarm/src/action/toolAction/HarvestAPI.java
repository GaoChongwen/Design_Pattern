package action.toolAction;

import base.Plant;
import utils.Enum.PlantType;

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
