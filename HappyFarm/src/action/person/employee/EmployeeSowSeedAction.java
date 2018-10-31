package action.person.employee;

import base.plant.Plant;
import building.farmland.FarmLand;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 *
 * Design-Pattern: Singleton, Template Method.
 */
public class EmployeeSowSeedAction extends EmployeeCultivateAction {
    private  Plant seed = null;
    private  FarmLand farmLand = null;

    private volatile static EmployeeSowSeedAction instance = new EmployeeSowSeedAction();
    private EmployeeSowSeedAction(){
        templateMethodOutput("constructor", "I am created.");
    }
    public static EmployeeSowSeedAction getInstance() {
        return instance;
    }

    @Override
    protected boolean checkTool() {
        templateMethodOutput("step 1_1_2. checkTool","checking seed and farmland");
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
        templateMethodOutput("step 1_2. execute", "an employee is sowing seed");
        farmLand.plant(seed);
    }

    public  EmployeeSowSeedAction setFarmLand(FarmLand farmLand) {
        //templateMethodOutput("setFarmLand", "a farm land is specified.");
        this.farmLand = farmLand;
        return instance;
    }

    public  EmployeeSowSeedAction setSeed(Plant seed) {
        //templateMethodOutput("setSed", "a seed is specified.");
        this.seed = seed;
        return instance;
    }

    protected String getClassName() {
        return "EmployeeSowSeedAction";
    }
    protected String getObjectID() {
        return "instance";
    }
}
