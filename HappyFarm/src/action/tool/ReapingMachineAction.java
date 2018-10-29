package action.tool;


import propComp.tools.Tool;
import utils.Enum.PlantType;



/**
 *
 */
public class ReapingMachineAction extends ToolAction {
    public ReapingMachineAction(Tool tool){
        super(tool);
    }

    @Override
    public boolean harvest(PlantType plantType) {
        System.out.println("Harvesting "+plantType+" with Reaping Machine.");
        return true;
    }

    @Override
    public boolean harvest() {
        System.out.println("Harvesting with Reaping Machine.");
        return true;
    }

    @Override
    public boolean harvestWheat() {
        System.out.println("Harvesting reap with Reaping Machine.");
        return true;
    }

}
