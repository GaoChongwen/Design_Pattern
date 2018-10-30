package action.person.employee;

import base.FarmObj;
import base.plant.Plant;
import building.farmland.FarmLand;
import propComp.tools.Tool;

/**
 * Design-Pattern: Singleton, Template Method.
 *
 * The class <coode>EmployeeHarvestAction</coode> is a singleton, which cannot be
 * instantiated by anyone.
 *
 * The method {@link EmployeeHarvestAction#execute()} is realized, which can be
 * executed only if all the targets of the harvest action is set.
 *
 * @author Chudi LAN
 * @version 2018-10-29
 */
public class EmployeeHarvestAction extends EmployeeCultivateAction {
    private static FarmLand farmLand = null;
    private static Tool harvestTool = null;

    private volatile static EmployeeHarvestAction instance = new EmployeeHarvestAction();
    private EmployeeHarvestAction(){}
    public static EmployeeHarvestAction getInstance() {
        farmLand = null;
        harvestTool = null;
        setTarget(null);
        return instance;
    }

    @Override
    protected boolean checkTool() {
        if(farmLand==null){
            System.out.println("You haven't specified a farmland to harvest.");
            return false;
        }
        if(harvestTool==null){
            System.out.println("You haven't specified a tool to harvest.");
            return false;
        }
        return true;
    }

    /**
     * The actual execution of the harvesting action.
     *
     * Note that the preconditions of execute() are:
     *      1. An employee is assigned by {@link #setTarget(FarmObj)}
     *      2. A plant is specified by {@link #setFarmLand(FarmLand)} (Farmland)}
     *      3. A tool is sepcified by {@link #setHarvestTool(Tool)}
     */
    @Override
    protected void execute() {
        farmLand.harvest();
    }

    public static void setFarmLand(FarmLand farmLand) {
        EmployeeHarvestAction.farmLand = farmLand;
    }

    public static void setHarvestTool(Tool harvestTool) {
        EmployeeHarvestAction.harvestTool = harvestTool;
    }
}
