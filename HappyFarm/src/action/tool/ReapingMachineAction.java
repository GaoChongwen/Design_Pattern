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
    void execute() {
        templateMethodOutput("ReapingMachineAction: step 2. execute()","harvasting with a reaping machine.");
    }

    @Override
    public void execute(boolean success) {

    }
}
