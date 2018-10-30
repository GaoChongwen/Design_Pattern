package produce;

import animal.Chicken;
import base.Produce;
import factory.ProduceFactory;
import utils.Enum.ProduceType;
import utils.Context;

/**
 * Design-Pattern: Prototype

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class foodChicken extends Produce {
    public foodChicken(){
        this.salePrice = Context.foodChicken_price;
        this.type = ProduceType.foodChicken;
    }
}