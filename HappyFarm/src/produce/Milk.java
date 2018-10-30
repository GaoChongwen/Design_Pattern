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
        super();
        this.type = ProduceType.milk;
        this.farmPrice=Context.getInstance().cow_salePrice;
        this.salePrice=this.farmPrice*2;
        ProduceFactory.getInstance().createProduce(this.getType());
        System.out.println("milk initial once");
    }
}