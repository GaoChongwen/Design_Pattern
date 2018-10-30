package produce;

import plant.Rice;
import base.Produce;
import factory.ProduceFactory;
import utils.Enum.ProduceType;

/**
 * Design-Pattern: Prototype

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class rice extends Produce {
    public rice(int farmPrice,int salePrice){
        this.type = ProduceType.rice;
        this.farmPrice=farmPrice;
        this.salePrice=salePrice;
        ProduceFactory.getInstance().putProduce(this);
        System.out.println("rice initial once");
    }
}