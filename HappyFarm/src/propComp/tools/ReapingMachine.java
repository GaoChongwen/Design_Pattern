package propComp.tools;

import action.toolAction.HarvestAPI;
import utils.Enum.ToolType;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class ReapingMachine extends Tool {
    public ReapingMachine(HarvestAPI harvestAPI){
        super(ToolType.reaping_machine, harvestAPI);
    }

    @Override
    public void use() {
        harvestAPI.harvest();
    }
}
