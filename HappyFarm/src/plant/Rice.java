package plant;

import base.Plant;
import factory.PlantFactory;
import utils.Enum.PlantType;

/**
 * Design-Pattern: State, Prototype
 *
 * @author lipeng liang
 * @version 2018/10/28
 */

public class Rice extends Plant {

    public Rice(int stockPrice, int salePrice) {
        super(stockPrice, salePrice);
        this.type = PlantType.rice;
        this.stockPrice = stockPrice;
        this.salePrice = salePrice;
        PlantFactory.getInstance().putPlant(this);
        System.out.println("rice initial once");
    }
}
