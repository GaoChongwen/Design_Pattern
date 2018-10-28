package plant;

import base.Plant;
import factory.PlantFactory;
import utils.Enum.PlantType;

/**
 * Design-Pattern: State, Prototype
 *
 * @version 2018/10/28
 * @author lipeng liang
 *
 */

public class Apple extends Plant {
    public Apple(int stockPrice,int salePrice){
        super(stockPrice,salePrice);
        this.type = PlantType.apple;
        this.stockPrice=stockPrice;
        this.salePrice=salePrice;
        PlantFactory.getInstance().putPlant(this);
        System.out.println("apple initial once");
    }
}
