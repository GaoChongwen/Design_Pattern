package test.bridge;

import action.tool.ReapingMachineAction;
import action.tool.SickleAction;
import action.tool.ToolAction;
import action.tool.WheatReapingMachineAction;
import base.Action;
import propComp.tools.ReapingMachine;
import propComp.tools.Sickle;
import propComp.tools.Tool;
import utils.Enum.DesignPatternMode;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class Bridge {
    public static void main(String args[]){
        Tool.setDesignPatternMode(DesignPatternMode.BridgePattern);
        Action.setDesignPatternMode(DesignPatternMode.BridgePattern);

        System.out.println("" +
                "\n====================================================================\n" +
                "\n Scenario 1" +
                "\n     Bound HarvestAPI implemented by SickleAction to a Sickle: " +
                "\n         create a sickle with sickleAction" +
                "\n     -------------------------------------------------------   " +
                "\n                     [ Bridge Pattern ]");
        Tool sickleTool = new Sickle(new SickleAction());
        sickleTool.use();
        System.out.println();

        System.out.println("" +
                "\n====================================================================\n" +
                "\n Scenario 2" +
                "\n     Bound HarvestAPI implemented by ReapingMachineAction to a" +
                "\n     ReapingMachine: " +
                "\n         create a reaping machine with reapingMachineAction." +
                "\n     -------------------------------------------------------   " +
                "\n                     [ Bridge Pattern ]");
        Tool reapingMachineTool = new ReapingMachine(new ReapingMachineAction());
        reapingMachineTool.use();
        System.out.println("\n====================================================================\n");


        System.out.println("" +
                "\n====================================================================\n" +
                "\n Scenario 3" +
                "\n     Bound HarvestAPI implemented by WheatReapingMachineAction to a" +
                "\n     ReapingMachine: " +
                "\n         Create a reaping machine with WheatReapingMachineAction " +
                "\n         so the reaping machine is therefore performing as a wheat" +
                "\n         reaping machine." +
                "\n     -------------------------------------------------------   " +
                "\n                     [ Bridge Pattern ]");
        Tool wheatReapingMachineTool = new ReapingMachine(new WheatReapingMachineAction());
        wheatReapingMachineTool.use();
        System.out.println("\n====================================================================\n");

    }
}
