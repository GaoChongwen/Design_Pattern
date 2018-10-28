package plant;

import base.Plant;
import factory.PlantFactory;
import utils.Enum.PlantType;

/**
 * Design-Pattern: State, Singleton
 *
 * @author lipeng liang
 * @version 2018/10/28
 */

public class Rice extends Plant {

    public Rice(int stockPrice, int salePrice) {
        super(stockPrice, salePrice);
        PlantFactory.getInstance().putPlant(this);
        this.type = PlantType.rice;
        this.stockPrice = stockPrice;
        this.salePrice = salePrice;
    }
}
