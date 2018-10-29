package base;

/**
 * @author
 * Design-Pattern: Bridge, Proxy, Responsibility
 *      Bridge for Tools&ToolAction
 *      Proxy&ChainOfResponsibility for Coupon
 */
public class Item extends FarmObj {
    protected int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void use(){
    }
}
