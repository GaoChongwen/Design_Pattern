package building.farmland;

import factory.FarmLandFactory;
/**
 * Design-Pattern: Prototype, Factory
 *
 * @author lipeng liang
 * @version 2018/10/28
 */
public class CornField extends FarmLand{
    public CornField(int price){
        super(price);
        this.price=price;
        FarmLandFactory.getInstance().putFarmLand(this);
        System.out.println("CornField only initial once");
    }
}