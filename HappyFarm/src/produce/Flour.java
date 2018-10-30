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
        this.salePrice = Context.flour_price;
        this.type = ProduceType.flour;
        ProduceFactory.getInstance().putProduce(this);
    }
}
