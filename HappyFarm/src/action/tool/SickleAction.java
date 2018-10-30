package action.tool;


import propComp.tools.Tool;
import utils.Enum.PlantType;


/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class SickleAction extends  ToolAction{
    public SickleAction(){
        output("constructor", "I am created.");
    }

    @Override
    public boolean harvest() {
        output("harvest", "harvesting with sickle.");
        return true;
    }

    protected String getClassName() {
        return "SickleAction";
    }
    protected String getObjectID() {
        return "";
    }
}
