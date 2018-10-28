package building.farmland;

import factory.FarmLandFactory;
/**
 * Design-Pattern: Prototype, Factory
 *
 * @author lipeng liang
 * @version 2018/10/28
 */
public class RiceField extends FarmLand{
    public RiceField(int price){
        super(price);
        this.price=price;
        FarmLandFactory.getInstance().putFarmLand(this);
        System.out.println("RiceField only initial once");
    }
}
