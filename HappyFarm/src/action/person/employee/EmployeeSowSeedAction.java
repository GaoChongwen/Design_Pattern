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
        output("constructor", "I am created.");
    }
    public static EmployeeSowSeedAction getInstance() {
        return instance;
    }

    @Override
    protected boolean checkTool() {
        output("checkTool","checking seed and farmland");
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
        output("execute", "sowing seed");
        farmLand.plant(seed);
    }

    public  void setFarmLand(FarmLand farmLand) {
        output("setFarmLand", "a farm land is specified.");
        this.farmLand = farmLand;
    }

    public  void setSeed(Plant seed) {
        output("setSed", "a seed is specified.");
        this.seed = seed;
    }

    protected String getClassName() {
        return "EmployeeSowSeedAction";
    }
    protected String getObjectID() {
        return "instance";
    }
}
