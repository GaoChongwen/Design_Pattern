package action.tool;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 */
public class WheatReapingMachineAction extends ReapingMachineAction{
    public WheatReapingMachineAction(){
        templateMethodOutput("constructor", "I am created.");
    }

    @Override
    public boolean harvest() {
        //templateMethodOutput("harvest","harvesting with wheat reaping machin.");
        return false;
    }


    protected String getClassName() {
        return "WheatReapingMachineAction";
    }
    protected String getObjectID() {
        return "";
    }
}
