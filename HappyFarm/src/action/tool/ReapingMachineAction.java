package action.tool;

/**
 *
 */
public class ReapingMachineAction extends ToolAction {
    public ReapingMachineAction(){
        defaultOutput("ReapingMachineAction", "a ReapingMachineAction is created.");
        templateMethodOutput("constructor","I am created.");
        bridgeOutput("ReapingMachineAction", "a ReapingMachineAction is created.");
    }

    @Override
    public boolean harvest() {
        bridgeOutput("ReapingMachine: harvest","The tool functions as a reaping machine.");
        return true;
    }

    protected String getClassName() {
        return "ReapingMachineAction";
    }
    protected String getObjectID() {
        return "";
    }

    @Override
    public void execute(boolean success) {

    }
}
