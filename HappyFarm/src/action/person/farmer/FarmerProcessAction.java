package action.person.farmer;

import animal.Cow;
import base.FarmObj;
import base.animal.Animal;
import base.plant.Plant;
import processSystem.ProcessMaker;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method
 */
public class FarmerProcessAction extends FarmerAction{
    private static FarmObj farmObj = null;

    private volatile static FarmerProcessAction instance = new FarmerProcessAction();
    private FarmerProcessAction(){
        super();
        System.out.println("FarmerProcessAction instance is created.");
    }
    public static FarmerProcessAction getInstance(){
        farmObj = null;
        return instance;
    }

    /** validate the farmObj to process
     *
     *  Precondition of execute():
     *      1. setfarmObj()
     */
    @Override
    protected boolean checkCondition() {
        System.out.println("FarmerProcessAction instance is checking conditions.");
        if(farmObj == null){
            System.out.println("You haven't specified which farmObj to process.");
            return false;
        }
        return true;
    }


    @Override
    protected void execute() {
        System.out.println("FarmerProcessAction instance is executing.");
        if(farmObj.getName().length() > 2 && farmObj.getName().substring(0, 3) == "cow"){
            ProcessMaker.getInstance().processCow((Cow) farmObj);
        }else if(farmObj.getType()=="Animal"&&farmObj.getName().length() > 2 && farmObj.getName().substring(0, 3) != "cow"){
            ProcessMaker.getInstance().processMeat((Animal)farmObj);
        }else if(farmObj.getType()=="Plant"){
            ProcessMaker.getInstance().processPlant((Plant)farmObj);
        }
    }

    public static void setFarmObj(FarmObj farmObj) {
        System.out.println("FarmObj "+farmObj.getName()+" is set to FarmerProcessAction.");
        FarmerProcessAction.farmObj = farmObj;
    }
}
