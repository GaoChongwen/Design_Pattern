package plant;

import base.Plant;
import factory.PlantFactory;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

/**
 * Design-Pattern: State, Prototype
 *
 * @version 2018/10/28
 * @author lipeng liang
 *
 */

public class Cabbage extends Plant {
    public Cabbage(int stockPrice, int salePrice) {
        super(stockPrice,salePrice);
        this.type = PlantType.cabbage;
        this.stockPrice = stockPrice;
        this.salePrice = salePrice;
        this.reqLandType= FarmLandType.vegtbField;
        PlantFactory.getInstance().putPlant(this);
        System.out.println("cabbage initial once");
    }

}
