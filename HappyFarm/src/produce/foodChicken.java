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
        super();
        this.type = ProduceType.foodChicken;
        this.farmPrice=Context.getInstance().chicken_salePrice;
        this.salePrice=this.farmPrice*3;
        ProduceFactory.getInstance().createProduce(this.getType());
        System.out.println("foodChicken initial once");
    }
}