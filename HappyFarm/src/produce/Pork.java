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

public class Pork extends Produce {
    public Pork(){
        this.salePrice = Context.pork_price;
        this.type = ProduceType.pork;
        ProduceFactory.getInstance().putProduce(this);
    }
}