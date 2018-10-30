package produce;

import plant.Wheat;
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

public class Flour extends Produce {
    public Flour(){
        super();
        this.type = ProduceType.flour;
        this.farmPrice=Context.getInstance().wheat_salePrice;
        this.salePrice=this.farmPrice*2;
        ProduceFactory.getInstance().createProduce(this.getType());
        System.out.println("flour initial once");
    }
}
