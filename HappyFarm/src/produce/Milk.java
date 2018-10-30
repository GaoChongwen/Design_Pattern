package produce;

import animal.Cow;
import base.Produce;
import factory.ProduceFactory;
import utils.Enum.ProduceType;
import utils.Context;

/**
 * Design-Pattern: Facade

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class Milk extends Produce {
    public Milk(){
        this.salePrice = Context.milk_price;
        this.type = ProduceType.milk;
        ProduceFactory.getInstance().putProduce(this);
    }
}