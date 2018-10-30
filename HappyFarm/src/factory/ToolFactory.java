package factory;
import action.tool.WheatReapingMachineAction;
import propComp.tools.ReapingMachine;
import propComp.tools.Sickle;
import propComp.tools.Tool;

public class ToolFactory extends AbstractFactory{
    private volatile static ToolFactory instance = new ToolFactory();

    public static ToolFactory getInstance() {
        return instance;
    }

    @Override
    Tool createTool(String name) {
        if(name.equals("reapingMachine")){
            return new ReapingMachine();
        }
        if(name.equals("wheatReapingMachine")){
            return new ReapingMachine(new WheatReapingMachineAction());
        }
        if(name.equals("sickle")){
            return new Sickle();
        }
        return null;
    }
}
