package action.person.farmer;

import action.person.farmer.FarmerAction;
import store.Store;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method.
 */

public class FarmerBuyAction extends FarmerAction {
    private String itemName=null;
    private int count=0;

    private static FarmerBuyAction instance = new FarmerBuyAction();

    /** Don't let anyone instantiate this class */
    private FarmerBuyAction(){
        output("constructor","I am created.");
    }

    public static FarmerBuyAction getInstance() {
        return instance;
    }

    /**
     * Returns a boolean to indicate whether execution of the Buying Action is valid.
     *
     * The preconditions execute():
     *      1. the name of item is specified by {@link #setItemName(String)}
     *      2. the count of item is specified by {@link #setCount(int)}
     *
     * @return the result of condition checking for execute()
     */
    @Override
    protected boolean checkCondition() {
        output("checkCondition", "checking item name and count.");
        if(itemName == null){
            System.out.println("ERROR: you haven't specified item name.");
            return false;
        }
        if(count<0){
            System.out.println("ERROR: Invalid number.");
        }
        return true;
    }

    /**
     *
     */
    @Override
    protected void execute() {
        output("execute","buying "+count+" "+itemName);
//        Store.getInstance().buyCommity(itemName,count);
    }

    public void setCount(int count) {
        output("setCount", "count is specified.");
        this.count = count;
    }

    public void setItemName(String itemName) {
        output("setItemName", "an item name is specified.");
        this.itemName = itemName;
    }

    protected String getClassName() {
        return "FarmerBuyAction";
    }
    protected String getObjectID() {
        return "instance";
    }
}
