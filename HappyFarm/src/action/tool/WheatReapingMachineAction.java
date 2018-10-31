package action.tool;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 */
public class WheatReapingMachineAction extends ReapingMachineAction{
    public WheatReapingMachineAction(){
        defaultOutput("WheatReapingMachineAction", "a wheat reaping machine is created.");
        templateMethodOutput("constructor", "I am created.");
        bridgeOutput("WheatReapingMachineAction", "a WheatReapingMachineAction is created.");
    }

    @Override
    public boolean harvest() {
        bridgeOutput("WheatReapingMachine: harvest","The tool functions as a wheat reaping machine.");
        return false;
    }


    protected String getClassName() {
        return "WheatReapingMachineAction";
    }
    protected String getObjectID() {
        return "";
    }
}
