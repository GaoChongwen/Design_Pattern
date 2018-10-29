package action.personAction;

import base.FarmObj;
import base.Item;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method.
 */

public class FarmerBuyAction extends  FarmerAction{
    private Item item;
    private int count;

    public FarmerBuyAction(Item item, int count){
        this.item = item;
        this.count = count;
    }

    protected FarmerBuyAction(){
        super();
    }

    @Override
    public void doAction() {
        System.out.println("Purchasing " + item);
        if(!checkStock()){
            System.out.println("Purchase exceeds the stock of the store.");
        }

        if(!checkBalance()){
            System.out.println("Money or Coupon not enough.");
            return;
        }
        if(!checkCapacity()){
            System.out.println("Warehouse capacity is not enough.");
            return;
        }

        buy();
    }

    protected boolean checkBalance(){
        // todo check balance
        return false;
    }

    protected  boolean checkStock(){
        // todo check store's stock
        return false;
    }

    protected boolean checkCapacity(){
        // todo check warehouse capacity
        return false;
    }
    protected void buy(){
        // todo add to warehouse
        // todo money.use()
        System.out.println("Purchase complete.");
    }
}
