package base;

/**
 * @author Design-Pattern: Bridge, Proxy, Responsibility
 * Bridge for Tools&ToolAction
 * Proxy&ChainOfResponsibility for Coupon
 */
public abstract class Item extends FarmObj {
    protected int price;
    protected boolean isUsed;

    protected Item(){
        isUsed=false;
    }

    protected int getPrice() {
        return price;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    protected void use() {}

    protected void buy() {}

    protected void sell(){}

    public boolean getIsUsed(){
        return isUsed;
    }
}
