package action.person.farmer;

import action.person.farmer.FarmerAction;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method.
 */

public class FarmerBuyAction extends FarmerAction {
    private String itemName;
    private int count;

    public FarmerBuyAction(String itemName, int count){
        super();
        this.itemName = itemName;
        this.count = count;
    }

    @Override
    protected void execute() {
        System.out.println("Purchase success.");
    }


    @Override
    protected boolean checkCondition() {
        return Store.getInstance().buy(itemName, count);
    }
}
