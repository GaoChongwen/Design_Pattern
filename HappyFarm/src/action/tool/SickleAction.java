package action.tool;


/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class SickleAction extends  ToolAction{
    public SickleAction(){
        templateMethodOutput("constructor", "I am created.");
    }

    @Override
    public boolean harvest() {
        templateMethodOutput("harvest", "harvesting with sickle.");
        return true;
    }

    protected String getClassName() {
        return "SickleAction";
    }
    protected String getObjectID() {
        return "";
    }

    @Override
    public void execute(boolean success) {

    }
}
