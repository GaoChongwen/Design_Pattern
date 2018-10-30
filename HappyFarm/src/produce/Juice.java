package produce;

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
        this.salePrice = Context.juice_price;
        this.type = ProduceType.juice;
        ProduceFactory.getInstance().putProduce(this);
    }
}