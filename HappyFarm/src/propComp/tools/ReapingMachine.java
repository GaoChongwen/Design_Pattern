package propComp.tools;

import action.tool.HarvestAPI;
import action.tool.ReapingMachineAction;
import utils.Enum.ToolType;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class ReapingMachine extends Tool {
    /**
     * Default constructor:
     *      Assign ReapingMachineAction by default.
     */
    public ReapingMachine(){
        this(new ReapingMachineAction());
        setName("reapingMachine");
        bridgeOutput("ReapingMachine()","A reaping machine is created.");
    }
    /**
     * For Bridge Pattern.
     *
     * @param harvestAPI specify the action of machine.
     */
    public ReapingMachine(HarvestAPI harvestAPI){
        super(ToolType.reaping_machine, harvestAPI);
        bridgeOutput("ReapingMachine(HarvestAPI)","the action is bound to reaping machine.");
        setName("reapingMachine");
    }

    @Override
    public void use() {
        harvestAPI.harvest();
    }
}
