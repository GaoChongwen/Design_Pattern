package test.bridge;

import action.tool.ReapingMachineAction;
import action.tool.SickleAction;
import action.tool.ToolAction;
import action.tool.WheatReapingMachineAction;
import base.Action;
import propComp.tools.*;
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
                "\n     Create a reaping machine that only harvests rice " +
                "\n     -------------------------------------------------------   " +
                "\n                     [ Bridge Pattern ]");
        Tool riceReapingMachine = new ReapingMachine(new RiceReapingMachine());
        riceReapingMachine.harvest();
        System.out.println("\n====================================================================\n");

        System.out.println("" +
                "\n====================================================================\n" +
                "\n Scenario 2" +
                "\n     Create a reaping machine that only harvests wheat" +
                "\n     -------------------------------------------------------   " +
                "\n                     [ Bridge Pattern ]");
        Tool wheatRepingMachine = new ReapingMachine(new WheatReapingMachine());
        wheatRepingMachine.harvest();
        System.out.println("\n====================================================================\n");
    }
}
