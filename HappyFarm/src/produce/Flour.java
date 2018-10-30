package produce;

import plant.Wheat;
import base.Produce;
import factory.ProduceFactory;
import utils.Enum.ProduceType;

/**
 * Design-Pattern: Prototype

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class Flour extends Produce {
    public Flour (int salePrice){
        this.type = ProduceType.flour;
        this.farmPrice=Wheat.getSalePrice();
        this.salePrice=salePrice;
        ProduceFactory.getInstance().putProduce(this);
        System.out.println("flour initial once");
    }
}
