package action.tool;

import base.Action;
import propComp.tools.HarvestAPI;

/**
 * Design-Pattern: Bridge, Strategy
 *
 * <p> Note that class <class>ToolAction</class> designed only for implementing
 * Bridge & Strategy Patterns.</p>
 *
 * <p> The inheritance system of <class>ToolAction</class> may cause some logical
 * incoherence.</p>
 *
 * @author Chudi LAN
 * @version 2018-10-28
 */
public abstract class ToolAction extends Action {
    protected ToolAction(){
    }

    protected void doSomething() {
        templateMethodOutput("ToolAction: step 1. doSomething","harvesting with a tool.");
        execute();
    }

    protected String getClassName() {
        return "ToolAction";
    }
    protected String getObjectID() {
        return "";
    }

    abstract void execute();
}
