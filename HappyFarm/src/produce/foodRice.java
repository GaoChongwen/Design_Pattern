package produce;

import plant.Rice;
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

public class foodRice extends Produce {
    public foodRice(){
        super();
        this.type = ProduceType.foodRice;
        this.farmPrice=Context.getInstance().rice_salePrice;
        this.salePrice=this.farmPrice*2;
        ProduceFactory.getInstance().createProduce(this.getType());
        System.out.println("foodRice initial once");
    }
}