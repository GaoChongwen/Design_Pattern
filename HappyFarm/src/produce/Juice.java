package produce;

import plant;
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

public class Juice extends Produce {
    public Juice(){
        super();
        this.type = ProduceType.juice;
        this.farmPrice=Context.getInstance().apple_salePrice;
        this.salePrice=this.farmPrice*2;
        ProduceFactory.getInstance().createProduce(this.getType());
        System.out.println("juice initial once");
    }
}