package action.person;

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
        super();
        this.item = item;
        this.count = count;
    }

    protected FarmerBuyAction(){
        super();
    }

    @Override
    protected void execute() {
        if(!checkCondition()){
            System.out.println("Purchase failed。");
            return;
        }
        buy();
    }

    @Override
    protected boolean checkCondition() {
        System.out.println("Purchasing " + item);
        if(!checkStock()){
            System.out.println("Purchase exceeds the stock of the store.");
            return false;
        }

        if(!checkBalance()){
            System.out.println("Money or Coupon not enough.");
            return false;
        }
        if(!checkCapacity()){
            System.out.println("Warehouse capacity is not enough.");
            return false;
        }
        return true;
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
        // item.buy();
        // Money.getInstance().use(item.getPrice() * count);
        System.out.println("Purchase complete.");
    }
}
