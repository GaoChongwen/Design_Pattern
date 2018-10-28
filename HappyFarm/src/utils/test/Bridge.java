package utils.test;

import action.toolAction.ReapingMachineAction;
import action.toolAction.SickleAction;
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
        Tool sickleTool = new Sickle(SickleAction.getInstance());
        Tool reapingMachineTool = new ReapingMachine(ReapingMachineAction.getInstance());

        sickleTool.use();
        reapingMachineTool.use();
    }
}
