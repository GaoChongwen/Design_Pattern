package plant;

import base.plant.Plant;
import factory.PlantFactory;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

/**
 * Design-Pattern: State, Prototype
 * @description: 水稻类，继承植物类
 * @author lipeng liang
 * @version 2018/10/28
 */

public class Rice extends Plant {

    public Rice(int stockPrice, int salePrice) {
        super(stockPrice, salePrice);
        this.type = PlantType.rice;
        this.stockPrice = stockPrice;
        this.salePrice = salePrice;
        this.reqLandType= FarmLandType.riceField;
        PlantFactory.getInstance().putPlant(this);
        System.out.println("rice initial once");
    }
}
