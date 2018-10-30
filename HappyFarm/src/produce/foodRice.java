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

public class foodRice extends Produce {
    public foodRice(){
        this.salePrice = Context.foodRice_price;
        this.type = ProduceType.foodRice;
        ProduceFactory.getInstance().putProduce(this);
    }
}