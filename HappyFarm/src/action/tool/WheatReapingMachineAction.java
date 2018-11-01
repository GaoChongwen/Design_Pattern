package action.tool;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 */
public class WheatReapingMachineAction extends ReapingMachineAction{
    public WheatReapingMachineAction(){
        bridgeOutput("WheatReapingMachineAction", "a WheatReapingMachineAction is created.");
    }


    protected String getClassName() {
        return "WheatReapingMachineAction";
    }
    protected String getObjectID() {
        return "";
    }

    @Override
    void execute() {
        templateMethodOutput("WheatReapingMachine step 2. execute","harvesting with a reaping machine");
    }
}
