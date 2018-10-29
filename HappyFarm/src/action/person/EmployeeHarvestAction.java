package action.person;

import base.plant.Plant;
import propComp.tools.Tool;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 *
 * Design-Pattern: Singleton, Template Method.
 */
public class EmployeeHarvestAction extends EmployeeCultivateAction{
    private static Plant plant = null;
    private static Tool harvestTool = null;

    private volatile static EmployeeHarvestAction instance = new EmployeeHarvestAction();
    private EmployeeHarvestAction(){}
    public static EmployeeHarvestAction getInstance() {
        plant = null;
        harvestTool = null;
        setTarget(null);
        return instance;
    }

    @Override
    protected boolean checkTool() {
        if(plant==null){
            System.out.println("You haven't specified a plant to harvest.");
            return false;
        }
        if(harvestTool==null){
            System.out.println("You haven't specified a tool to harvest.");
            return false;
        }
        return true;
    }

    @Override
    protected void execute() {
        plant.harvest();
    }
}
