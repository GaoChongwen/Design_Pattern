package action.tool;

/**
 *
 */
public class ReapingMachineAction extends ToolAction {
    public ReapingMachineAction(){
        bridgeOutput("ReapingMachineAction", "a ReapingMachineAction is created.");
    }

    protected String getClassName() {
        return "ReapingMachineAction";
    }
    protected String getObjectID() {
        return "";
    }

    @Override
    boolean execute() {
        templateMethodOutput("ReapingMachineAction: step 2. execute()","harvasting with a reaping machine.");
        return false;
    }

    @Override
    public boolean execute(boolean success) {
        return success;
    }

}
