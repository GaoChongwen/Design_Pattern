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
    }
    public static FarmerSellAction getInstance() {
        itemName = null;
        count = -1;
        return instance;
    }


    @Override
    protected boolean checkCondition() {
        if(itemName == null){
            System.out.println("You haven't specified which item to sell.");
            return false;
        }
        if(count == -1){
            System.out.println("You haven't specified how many items to sell.");
            return false;
        }
       return true;
    }

    @Override
    protected void execute() {
        if(Store.getInstance().sell(itemName, count)){
            System.out.println(itemName+" sold successfully.");
        }
    }
}
