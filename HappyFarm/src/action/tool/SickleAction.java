package action.tool;


/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class SickleAction extends  ToolAction{
    public SickleAction(){
        bridgeOutput("SickleAction", "a SickleAction is created.");
    }

    protected String getClassName() {
        return "SickleAction";
    }
    protected String getObjectID() {
        return "";
    }

    @Override
    boolean execute() {
        templateMethodOutput("SickleAction: step 2. execute()","harvesting with a sickle");
        return true;
    }

    @Override
    public boolean execute(boolean success) {
        return success;
    }
}
