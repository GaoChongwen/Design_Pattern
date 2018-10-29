package propComp.tools;

import action.tool.HarvestAPI;
import utils.Enum.ToolType;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class Sickle extends Tool {
    public Sickle(HarvestAPI harvestAPI){
        super(ToolType.sickle, harvestAPI);

    }
    @Override
    public void use() {
        harvestAPI.harvest();
    }
}
