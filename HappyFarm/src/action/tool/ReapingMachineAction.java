package action.tool;

/**
 *
 */
public class ReapingMachineAction extends ToolAction {
    public ReapingMachineAction(){
        templateMethodOutput("constructor","I am created.");
    }

    @Override
    public boolean harvest() {
        templateMethodOutput("harvest","harvesting with reaping machine.");
        return true;
    }


    protected String getClassName() {
        return "ReapingMachineAction";
    }
    protected String getObjectID() {
        return "";
    }
}
