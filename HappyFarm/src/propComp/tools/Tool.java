package propComp.tools;

import action.toolAction.HarvestAPI;
import base.FarmObj;
import utils.Enum.ToolType;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public abstract class Tool extends FarmObj {
    private ToolType toolType;
    protected HarvestAPI harvestAPI;

    protected Tool(ToolType toolType, HarvestAPI harvestAPI){
        this.harvestAPI = harvestAPI;
        this.toolType = toolType;
    }

    public ToolType getToolType() {
        return toolType;
    }

    public abstract void use();
}
