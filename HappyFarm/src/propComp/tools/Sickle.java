package propComp.tools;

import action.tool.HarvestAPI;
import action.tool.SickleAction;
import utils.Enum.ToolType;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class Sickle extends Tool {
    public Sickle(){
        this(new SickleAction());
        bridgeOutput("Sickle()","A sickle is create.");

    }

    public Sickle(HarvestAPI harvestAPI){
        super(ToolType.sickle, harvestAPI);
        bridgeOutput("Sickle(HarvestAPI)","The action is bound to sickle.");
    }
    @Override
    public void use() {
        harvestAPI.harvest();
    }
}
