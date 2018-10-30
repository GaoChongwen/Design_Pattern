package produce;

import animal.Cow;
import base.Produce;
import factory.ProduceFactory;
import utils.Enum.ProduceType;

/**
 * Design-Pattern: Facade

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class Milk extends Produce {
    public Milk(int farmPrice,int salePrice){
        this.type = ProduceType.milk;
        this.farmPrice=farmPrice;
        this.salePrice=salePrice;
        ProduceFactory.getInstance().putProduce(this);
        System.out.println("milk initial once");
    }
}