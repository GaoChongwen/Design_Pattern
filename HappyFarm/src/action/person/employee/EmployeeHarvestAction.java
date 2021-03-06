package action.person.employee;

import base.FarmObj;
import building.farmland.FarmLand;
import propComp.tools.Tool;

/**
 * Design-Pattern: Singleton, Template Method.
 *
 * The class <coode>EmployeeHarvestAction</coode> is a singleton, which cannot be
 * instantiated by anyone.
 *
 * The method {@link EmployeeHarvestAction#execute(boolean)} is realized, which can be
 * executed only if all the targets of the harvest action is set.
 *
 * @author Chudi LAN
 * @version 2018-10-29
 */
public class EmployeeHarvestAction extends EmployeeCultivateAction {
    private  FarmLand farmLand = null;
    private  Tool harvestTool = null;

    private volatile static EmployeeHarvestAction instance = new EmployeeHarvestAction();
    private EmployeeHarvestAction(){
        templateMethodOutput("constructor", "I am created.");
    }
    public static EmployeeHarvestAction getInstance() {
        return instance;
    }

    @Override
    protected boolean checkTool() {
        templateMethodOutput("step 1_1_2. checkTool","checking farmland and harvest tool.");
        if(farmLand==null){
            System.out.println("ERROR: You haven't specified a farmland to harvest.");
            return false;
        }
        if(harvestTool==null){
            System.out.println("ERROR: You haven't specified a tool to harvest.");
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
    public boolean execute(boolean success) {
        if(success){
            templateMethodOutput("step 1_2. execute", "harvesting in a farmland.");
            strategyPatternOutput("EmployeeHarvestAction: execute(true)","harvest action success strategy");
            farmLand.harvest();
            return true;
        }else {
            strategyPatternOutput("EmployeeHarvestAction: execute(false)", "harvest action success strategy");
            return false;
        }
    }

    public  EmployeeHarvestAction setFarmLand(FarmLand farmLand) {
//       templateMethodOutput("setFarmLand", "a farmland is specified.");
        this.farmLand = farmLand;
        return instance;
    }

    public EmployeeHarvestAction setHarvestTool(Tool harvestTool) {
//        templateMethodOutput("setHarvestTool", "a harvest tool is specified.");
        this.harvestTool = harvestTool;
        return instance;
    }

}
