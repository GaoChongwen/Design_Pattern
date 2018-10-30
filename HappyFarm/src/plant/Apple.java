package plant;

import base.plant.Plant;
import factory.PlantFactory;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

/**
 * @Design-Pattern: State, Prototype
 * @description: 苹果类，继承植物类
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
        this.reqLandType= FarmLandType.appleField;
        PlantFactory.getInstance().putPlant(this);
        System.out.println("apple initial once");
    }
}
