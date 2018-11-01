package action.person.farmer;

import store.Store;

/**
 * @author Chudi LAN
 * @version 2018-10-30
 */
public class FarmerSellAction extends FarmerAction {
    private  String itemName = null;

    private volatile static FarmerSellAction instance = new FarmerSellAction();
    private FarmerSellAction(){
        templateMethodOutput("constructor","I am created.");
    }
    public static FarmerSellAction getInstance() {
        return instance;
    }

    /** Override checkCondition()
     *
     *  Preconditions of execute():
     *      1. setItemName()
     *      2. setCount()
     */
    @Override
    protected boolean checkCondition() {
        templateMethodOutput("step 1_1. checkCondition","checking item name.");
        if(itemName == null){
            System.out.println("You haven't specified an itemName to FarmerSellAction.");
            return false;
        }
        return true;
    }

    @Override
    public boolean execute(boolean success) {
        if(success) {
            templateMethodOutput("1_2_1. execute", "selling item " + itemName);
            strategyPatternOutput("FarmerSellAction: execute(true)", "sell action success strategy");
            if (Store.getInstance().sellCommity(itemName)) {
                templateMethodOutput("1_2_2 execute", itemName + " sold successfully.");
            } else {
                templateMethodOutput("1_2_2 execute", "failed to sell " + itemName);
            }
        } else {
            strategyPatternOutput("FarmerSellAction: execute(false)", "sell action failed strategy");
        }
        return success;
    }

    public FarmerSellAction setItemName(String itemName) {
//        templateMethodOutput("setItemName", "an item name is specified.");
        this.itemName = itemName;
        return instance;
    }


    protected String getClassName() {
        return "FarmerSellAction";
    }
    protected String getObjectID() {
        return "instance";
    }
}
