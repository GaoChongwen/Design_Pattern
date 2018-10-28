package plant;

import base.Plant;
import factory.PlantFactory;
import utils.Context;
import utils.Enum.PlantType;

/**
 * Design-Pattern: State, Singleton
 *
 * @author lipeng liang
 * @version 2018/10/28
 */

public class Wheat extends Plant {
//    private static Wheat wheat = new Wheat(Context.wheat_stockPrice, Context.wheat_stockPrice);

    public Wheat(int stockPrice, int salePrice) {
        super(stockPrice, salePrice);
        PlantFactory.getInstance().putPlant(this);
        this.type = PlantType.wheat;
        this.stockPrice = Context.wheat_stockPrice;
        this.salePrice = salePrice;
    }

}
