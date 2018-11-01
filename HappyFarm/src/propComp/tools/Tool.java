package propComp.tools;

import base.Item;
import utils.Enum.DesignPatternMode;
import utils.Enum.ToolType;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Design-Pattern: Bridge
 */
public abstract class Tool extends Item {
    private ToolType toolType;

    /** for Bridge Pattern*/
    protected HarvestAPI harvestAPI;
    protected static DesignPatternMode designPatternMode = DesignPatternMode.Default;
    protected Tool(HarvestAPI harvestAPI){
        this.harvestAPI = harvestAPI;
    }
    public abstract void harvest();

    public Tool(){
        setType("tool");
    }

    public ToolType getToolType() {
        return toolType;
    }

    public abstract void use();

    protected void bridgeOutput(String methodName, String actionDesc){
        if(designPatternMode==DesignPatternMode.BridgePattern)
            System.out.println(methodName+ ": " +actionDesc);
    }

    static public void setDesignPatternMode(DesignPatternMode designPatternMode) {
        Tool.designPatternMode = designPatternMode;
    }
}
