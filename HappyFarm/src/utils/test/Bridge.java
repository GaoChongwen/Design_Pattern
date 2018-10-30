package utils.test;

import action.tool.ReapingMachineAction;
import action.tool.SickleAction;
import action.tool.WheatReapingMachineAction;
import propComp.tools.ReapingMachine;
import propComp.tools.Sickle;
import propComp.tools.Tool;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class Bridge {
    public static void main(String args[]){
//        Wheat wheat = (Wheat)PlantFactory.getInstance().createPlant(PlantType.wheat);
        Tool sickleTool = new Sickle(new SickleAction(null));
        Tool reapingMachineTool = new ReapingMachine(new ReapingMachineAction());
        Tool wheatReapingMachineTool = new ReapingMachine(new WheatReapingMachineAction((null)));


        sickleTool.use();
        reapingMachineTool.use();
        wheatReapingMachineTool.use();

        ReapingMachineAction action = new ReapingMachineAction(null);
    }
}
