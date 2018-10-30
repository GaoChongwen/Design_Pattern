package action.tool;


import propComp.tools.Tool;
import utils.Enum.PlantType;


/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class SickleAction extends  ToolAction{
    public SickleAction(){

    }

    @Override
    public boolean harvest() {
        System.out.println("Harvesting with Sickle.");
        return true;
    }

    @Override
    public boolean harvest(PlantType plantType) {
        System.out.println("Harvesting "+plantType+" with Sickle.");
        return true;
    }

    @Override
    public boolean harvestWheat() {
        System.out.println("Harvesting wheat with sickle.");
        return true;
    }
}
