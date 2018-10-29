package action.tool;

import base.Action;

import propComp.tools.Tool;

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

    abstract public boolean harvest(PlantType plantType);
    abstract public boolean harvest();
    abstract public boolean harvestWheat();
}
