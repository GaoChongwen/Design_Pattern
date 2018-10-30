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
    protected void execute() {
        templateMethodOutput("1_2. execute", "selling item "+itemName);
        if(Store.getInstance().sellCommity(itemName)){
            System.out.println(itemName+" sold successfully.");
        }
    }

    public void setItemName(String itemName) {
        templateMethodOutput("setItemName", "an item name is specified.");
        this.itemName = itemName;
    }


    protected String getClassName() {
        return "FarmerSellAction";
    }
    protected String getObjectID() {
        return "instance";
    }
}
