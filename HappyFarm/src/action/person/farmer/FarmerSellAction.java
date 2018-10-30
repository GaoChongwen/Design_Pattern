package action.person.farmer;

import action.person.farmer.FarmerAction;
import base.FarmObj;

/**
 * @author Chudi LAN
 * @version 2018-10-30
 */
public class FarmerSellAction extends FarmerAction {
    private static String itemName = null;
    private static int count = -1;

    private volatile static FarmerSellAction instance = new FarmerSellAction();
    private FarmerSellAction(){
        super();
        System.out.println("FarmerSellAction is created.");
    }
    public static FarmerSellAction getInstance() {
        itemName = null;
        count = -1;
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
        if(itemName == null){
            System.out.println("You haven't specified an itemName to FarmerSellAction.");
            return false;
        }
        if(count == -1){
            System.out.println("You haven't specified count to FarmerSellAction.");
            return false;
        }
        return true;
//       return Store.getInstance().sell(itemName, count);
    }

    @Override
    protected void execute() {
//        Store.getInstance().sell(itemName,count);
//        System.out.println(itemName+" sold successfully.");
    }

    public static void setItemName(String itemName) {
        FarmerSellAction.itemName = itemName;
    }

    public static void setCount(int count) {
        FarmerSellAction.count = count;
    }
}
