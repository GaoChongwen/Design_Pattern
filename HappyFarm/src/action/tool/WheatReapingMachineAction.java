package action.tool;

import propComp.tools.Tool;
import utils.Enum.PlantType;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 */
public class WheatReapingMachineAction extends ReapingMachineAction{
    public WheatReapingMachineAction(Tool tool){
        super(tool);
    }

    @Override
    public boolean harvest() {
        System.out.println("Harvesting with WheatReapingMachine.");
        return false;
    }

    @Override
    public boolean harvest(PlantType plantType) {
        if(plantType != PlantType.wheat){
            return false;
        }
        System.out.println("Harvesting "+ plantType + " with WheatReaping machine.");
        return true;
    }

    @Override
    public boolean harvestWheat() {
        System.out.println("harvesting wheat with reaping machine.");
        // todo: 处理速度
        return true;
    }

    private int harvestSpeed(PlantType plantType){
        return 0;
    }
}
