package action.toolAction;

import base.Action;
import base.plant.Plant;
import utils.Enum.PlantType;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Design-Pattern: Bridge, Strategy
 */
public abstract class ToolAction extends Action implements HarvestAPI {
    protected ToolAction(){}

    @Override
    protected boolean doSomething() {
        harvest((Plant)getTarget());
        return true;
    }

    @Override
    public void harvest(Plant plant) {
        if(plant.getType() == PlantType.wheat){
            harvestWheat();
        }
    }
}
