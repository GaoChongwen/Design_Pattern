package designPatterns.templateMethod.action.employee;

import base.plant.Plant;
import building.farmland.FarmLand;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 *
 * Design-Pattern: Singleton, Template Method.
 */
public class EmployeeSowSeedAction extends EmployeeCultivateAction {
    private static Plant seed = null;
    private static FarmLand farmLand = null;

    private volatile static EmployeeSowSeedAction instance = new EmployeeSowSeedAction();
    private EmployeeSowSeedAction(){}
    public static EmployeeSowSeedAction getInstance() {
        seed = null;
        farmLand = null;
        setTarget(null);
        return instance;
    }

    @Override
    protected boolean checkTool() {
        if(seed == null){
            System.out.println("You haven't specified a seed to plant.");
            return false;
        }
        if(farmLand == null){
            System.out.println("You haven't specified a farmland.");
            return false;
        }
        return true;
    }

    @Override
    protected void execute() {
        farmLand.plant(seed);
    }

    public static void setFarmLand(FarmLand farmLand) {
        EmployeeSowSeedAction.farmLand = farmLand;
    }

    public static void setSeed(Plant seed) {
        EmployeeSowSeedAction.seed = seed;
    }
}
