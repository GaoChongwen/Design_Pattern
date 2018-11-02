package piewerTest.Bridge;

import propComp.tools.ReapingMachine;
import propComp.tools.RiceReapingMachine;
import propComp.tools.Tool;
import propComp.tools.WheatReapingMachine;
import utils.Enum.DesignPatternMode;

public class Test {
    static public void main(String args[]) {
        // 设置Bride模式
        Tool.setDesignPatternMode(DesignPatternMode.BridgePattern);

        // 生成水稻收割机
        System.out.println("Bridge Test 1: create a rice reaping machine");
        Tool riceReapingMachine = new ReapingMachine(new RiceReapingMachine());
        riceReapingMachine.harvest();
        System.out.println();

        // 生成小麦收割机
        System.out.println("Bridge Test 2: create a wheat reaping machine");
        Tool wheatReapingMachine = new ReapingMachine(new WheatReapingMachine());
        wheatReapingMachine.harvest();
    }
}
