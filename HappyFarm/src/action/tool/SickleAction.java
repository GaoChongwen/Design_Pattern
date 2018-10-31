package action.tool;


/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class SickleAction extends  ToolAction{
    public SickleAction(){
        defaultOutput("SickleAction", "a SickleAction is created.");
        templateMethodOutput("constructor", "I am created.");
        bridgeOutput("SickleAction", "a SickleAction is created.");
    }

    @Override
    public boolean harvest() {
        bridgeOutput("SickleAction: harvest","The tool functions as sickle'");
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
