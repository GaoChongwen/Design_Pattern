package action.person.farmer;

import store.Store;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method.
 */

public class FarmerBuyAction extends FarmerAction {
    private String itemName = null;
    private int count = 0;

    private static FarmerBuyAction instance = new FarmerBuyAction();

    /**
     * Don't let anyone instantiate this class
     */
    private FarmerBuyAction() {
        templateMethodOutput("constructor", "I am created.");
    }

    public static FarmerBuyAction getInstance() {
        return instance;
    }

    /**
     * Returns a boolean to indicate whether execution of the Buying Action is valid.
     * <p>
     * The preconditions execute():
     * 1. the name of item is specified by {@link #setItemName(String)}
     * 2. the count of item is specified by {@link #setCount(int)}
     *
     * @return the result of condition checking for execute()
     */
    @Override
    protected boolean checkCondition() {
        templateMethodOutput("step 1_1. checkCondition", "checking item name and count.");
        if (itemName == null) {
            System.out.println("ERROR: you haven't specified item name.");
            return false;
        }
        if (count < 0) {
            System.out.println("ERROR: Invalid number.");
        }
        return true;
    }

    /**
     *
     */
    @Override
    public void execute(boolean success) {
        if(success) {
            templateMethodOutput("step 1_2_1. execute", "buying " + count + " " + itemName);
            strategyPatternOutput("FarmerBuyAction: execute(true)", "buy action success strategy");
            if (Store.getInstance().buyCommity(itemName, count)) {
                templateMethodOutput("step 1_2_2. execute", "purchase success.");
            } else {
                templateMethodOutput("step_1_2_2. ex3cute", "purchase failed,");
            }
        } else {
            strategyPatternOutput("FarmerBuyAction: execute(false)", "buy action failed strategy");
        }

    }

    public FarmerBuyAction setCount(int count) {
//        templateMethodOutput("setCount", "count is specified.");
        this.count = count;
        return instance;
    }

    public FarmerBuyAction setItemName(String itemName) {
//        templateMethodOutput("setItemName", "an item name is specified.");
        this.itemName = itemName;
        return instance;
    }

}
