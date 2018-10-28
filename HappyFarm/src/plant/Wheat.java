package plant;

import base.Plant;
import factory.PlantFactory;
import utils.Context;
import utils.Enum.PlantType;

/**
 * Design-Pattern: State, Prototype
 *
 * @author lipeng liang
 * @version 2018/10/28
 */

public class Wheat extends Plant {

    public Wheat(int stockPrice, int salePrice) {
        super(stockPrice, salePrice);
        this.type = PlantType.wheat;
        this.stockPrice = Context.wheat_stockPrice;
        this.salePrice = salePrice;
        PlantFactory.getInstance().putPlant(this);
        System.out.println("wheat initial once");

    }

}
