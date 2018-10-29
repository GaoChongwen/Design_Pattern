package action.toolAction;

import base.Action;

import propComp.tools.Tool;

import base.plant.Plant;

import utils.Enum.PlantType;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Design-Pattern: Bridge, Strategy
 */
public abstract class ToolAction extends Action implements HarvestAPI {
    protected ToolAction(Tool tool){
        super(tool);
    }

    @Override
    protected boolean doSomething() {
        harvest();
        return true;
    }

    @Override
    public boolean harvest(PlantType plantType) {
        return false;
    }

    @Override
    public boolean harvest() {
        return false;
    }

    @Override
    public boolean harvestWheat() {
        return false;
    }
}
