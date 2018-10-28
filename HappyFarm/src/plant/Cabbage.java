package plant;

import base.Plant;
import factory.PlantFactory;
import utils.Enum.PlantType;

/**
 * Design-Pattern: State
 *
 * @version 2018/10/28
 * @author lipeng liang
 *
 */

public class Cabbage extends Plant {
    public Cabbage(int stockPrice, int salePrice) {
        super(stockPrice,salePrice);
        PlantFactory.getInstance().putPlant(this);
        this.type = PlantType.cabbage;
        this.stockPrice = stockPrice;
        this.salePrice = salePrice;
    }

}
