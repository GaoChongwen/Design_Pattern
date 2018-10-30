package produce;

import animal.Chicken;
import base.Produce;
import factory.ProduceFactory;
import utils.Enum.ProduceType;

/**
 * Design-Pattern: Prototype

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class foodChicken extends Produce {
    public foodChicken(int farmPrice,int salePrice){
        this.type = ProduceType.foodChicken;
        this.farmPrice=farmPrice;
        this.salePrice=salePrice;
        ProduceFactory.getInstance().putProduce(this);
        System.out.println("foodChicken initial once");
    }
}