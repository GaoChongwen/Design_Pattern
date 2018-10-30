package plant;

import base.plant.Plant;
import factory.PlantFactory;
import utils.Context;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

/**
 * Design-Pattern: State, Prototype
 * @description: 小麦类，继承植物类
 * @author lipeng liang
 * @version 2018/10/28
 */

public class Wheat extends Plant {

    public Wheat(int stockPrice, int salePrice) {
        super(stockPrice, salePrice);
        this.type = PlantType.wheat;
        this.stockPrice = Context.wheat_stockPrice;
        this.salePrice = salePrice;
        this.reqLandType = FarmLandType.cornField;
        PlantFactory.getInstance().putPlant(this);
        System.out.println("wheat initial once");

    }

}
