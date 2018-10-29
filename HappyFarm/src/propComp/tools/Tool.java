package propComp.tools;

import action.tool.HarvestAPI;
import base.Item;
import utils.Enum.ToolType;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Design-Pattern: Bridge
 */
public abstract class Tool extends Item {
    private ToolType toolType;
    protected HarvestAPI harvestAPI;

    private Tool(){}

    protected Tool(ToolType toolType, HarvestAPI harvestAPI){
        this.harvestAPI = harvestAPI;
        this.toolType = toolType;
    }

    public ToolType getToolType() {
        return toolType;
    }

    public abstract void use();
}
