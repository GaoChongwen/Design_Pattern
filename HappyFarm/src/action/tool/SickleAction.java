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
    void execute() {
        templateMethodOutput("SickelAction: step 2. execute()","harvesting with a sickle");
    }

    @Override
    public void execute(boolean success) {

    }
}
