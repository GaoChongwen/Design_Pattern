package action.person.farmer;

import animal.Cow;
import base.FarmObj;
import base.Produce;
import base.animal.Animal;
import base.plant.Plant;
import processSystem.ProcessMaker;
import propComp.PropDir.Prop;
import singleton.Farm;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method
 */
public class FarmerProcessAction extends FarmerAction{

    private FarmObj farmObj = null;


    private volatile static FarmerProcessAction instance = new FarmerProcessAction();
    private FarmerProcessAction(){
        super();
        templateMethodOutput("constructor","I am created.");
    }
    public static FarmerProcessAction getInstance(){
        return instance;
    }

    /** validate the farmObj to process
     *
     *  Precondition of execute():
     *      1. setfarmObj()
     */
    @Override
    protected boolean checkCondition() {
        templateMethodOutput("step 1_1. checkCondition", "checking item.");
        if(farmObj == null){
            System.out.println("ERROR: You haven't specified which item to process.");
            return false;
        }
        return true;
    }


    public FarmerProcessAction setFarmObj(FarmObj farmObj) {
        //System.out.println("FarmObj "+farmObj.getName()+" is set to FarmerProcessAction.");
        this.farmObj = farmObj;
        return instance;
    }

    @Override
    public boolean execute(boolean success) {
        if(success) {
            templateMethodOutput("step 1_2. execute", "processing a farmObj.");
            strategyPatternOutput("FarmerProcessAction: execute(true)", "process action success strategy");
            Produce product = null;
            if(farmObj.getName().length() > 2 && farmObj.getName().substring(0, 3).equals("cow")){
                templateMethodOutput("step 1_2_1. execute","producing milk");
                product = (ProcessMaker.getInstance().processCow((Cow) farmObj));
            }
            else if(farmObj.getType().equals("Animal")&&farmObj.getName().length() > 2 && !farmObj.getName().substring(0, 3).equals("cow")){
                templateMethodOutput("step 1_2_1. execute","producing meat");
                product =(ProcessMaker.getInstance().processMeat((Animal)farmObj));
            }
            else if(farmObj.getType().equals("Plant")){
                templateMethodOutput("step 1_2_1.execute","producing fodder.");
                product =(ProcessMaker.getInstance().processPlant((Plant)farmObj));
             if(product != null){
                 Prop.addProduct(product);
             }
        }
        }else {
            strategyPatternOutput("FarmerProcessAction: execute(false)", "process action failed strategy");
        }
        return success;
    }
    protected String getClassName() {
        return "FarmerProcessAction";
    }

    protected String getObjectID() {
        return "instance";
    }

}
