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
        //System.out.println("a ReapingMachine has been created");
    }
    /**
     * For Bridge Pattern.
     *
     * @param harvestAPI specify the action of machine.
     */
    public ReapingMachine(HarvestAPI harvestAPI){
        super(ToolType.reaping_machine, harvestAPI);
    }

    @Override
    public void use() {
        harvestAPI.harvest();
    }
}
