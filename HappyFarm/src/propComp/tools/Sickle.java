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
        //System.out.println("a Sickle hase been created");
    }

    public Sickle(HarvestAPI harvestAPI){
        super(ToolType.sickle, harvestAPI);
    }
    @Override
    public void use() {
        harvestAPI.harvest();
    }
}
