package action.tool;

import base.Action;

import propComp.tools.Tool;

import utils.Enum.PlantType;

/**
 * Design-Pattern: Bridge, Strategy
 *
 * <p> Note that class <class>ToolAction</class> designed only for implementing
 * Bridge & Strategy Patterns.</p>
 *
 * <p> The inheritance system of <class>ToolAction</class> may cause some logical
 * incoherence.</p>
 *
 * @author Chudi LAN
 * @version 2018-10-28
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
