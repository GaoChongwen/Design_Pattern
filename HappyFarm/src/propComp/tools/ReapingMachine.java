package propComp.tools;

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
        setName("reapingMachine");
        System.out.println("ReapingMachine(): A reaping machine is created.");

    }
    /**
     * For Bridge Pattern.
     *
     * @param harvestAPI specify the action of machine.
     */
    public ReapingMachine(HarvestAPI harvestAPI){
        super((harvestAPI));
        bridgeOutput("ReapingMachine(HarvestAPI)","a reaping machine is created.");
        setName("reapingMachine");
    }

    @Override
    public void use() {
        harvestAPI.harvestWithMachine();

    }

    @Override
    public void harvest() {
        harvestAPI.harvestWithMachine();
//        System.out.println("ReapingMachine: harvest(): harvesting with reaping machine");
    }
}
