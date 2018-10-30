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

public class CookedFood extends Produce {
    public CookedFood(){
        this.salePrice = Context.cookedFood_price;
        this.type = ProduceType.cookedFood;
        ProduceFactory.getInstance().putProduce(this);
    }
}