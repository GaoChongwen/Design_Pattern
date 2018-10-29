package utils.test;

import action.toolAction.ReapingMachineAction;
import action.toolAction.SickleAction;
import action.toolAction.WheatReapingMachineAction;
import factory.PlantFactory;
import plant.Wheat;
import propComp.tools.ReapingMachine;
import propComp.tools.Sickle;
import propComp.tools.Tool;
import utils.Context;
import utils.Enum.PlantType;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class Bridge {
    public static void main(String args[]){
//        Wheat wheat = (Wheat)PlantFactory.getInstance().createPlant(PlantType.wheat);
        Tool sickleTool = new Sickle(new SickleAction(null));
        Tool reapingMachineTool = new ReapingMachine(new ReapingMachineAction(null));
        Tool wheatReapingMachineTool = new ReapingMachine(new WheatReapingMachineAction((null)));


        sickleTool.use();
        reapingMachineTool.use();
        wheatReapingMachineTool.use();
    }
}
