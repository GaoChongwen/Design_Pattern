package action.person.farmer;

import action.person.farmer.FarmerAction;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method.
 */

public class FarmerBuyAction extends FarmerAction {
    private static String itemName;
    private static int count;

    private static FarmerBuyAction instance = new FarmerBuyAction();

    /** Don't let anyone instantiate this class */
    private FarmerBuyAction(){

    }

    public static FarmerBuyAction getInstance() {
        itemName = null;
        count = -1;
        return instance;
    }

    /**
     * Returns a boolean to indicate whether execution of the Buying Action is valid.
     *
     * <p>The</p>
     *
     * @return the result of condition checking for execute()
     */
    @Override
    protected boolean checkCondition() {
        if(itemName == null){
            System.out.println("you haven't specified item name.");
            return false;
        }
        if(count==-1){
            return false;
        }
        return true;
    }

    @Override
    protected void execute() {
        System.out.println("FarmerBuyAction instance is executing.");
//        Store.getInstance().buy(itemName, count);
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setItemName(String itemName) {
        System.out.println("String "+itemName+" is set to FarmerBuyAction.");
        this.itemName = itemName;
    }
}
