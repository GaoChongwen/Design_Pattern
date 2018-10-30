package plant;

import base.plant.Plant;
import factory.PlantFactory;
import utils.Context;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

/**
 * Design-Pattern: State, Prototype
 * @description: 白菜类，继承植物类
 * @version 2018/10/28
 * @author lipeng liang
 *
 */

public class Cabbage extends Plant {
    public Cabbage() {
        super();
        this.type = PlantType.cabbage;
        this.stockPrice = Context.cabbage_stockPrice;
        this.salePrice = Context.cabbage_salePrice;
        this.reqLandType= FarmLandType.vegtbField;
        PlantFactory.getInstance().putPlant(this);
        System.out.println("cabbage initial once");
    }

}
