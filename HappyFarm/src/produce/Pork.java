package produce;

import animal.Pig;
import base.Produce;
import factory.ProduceFactory;
import utils.Enum.ProduceType;

/**
 * Design-Pattern: Prototype

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class Pork extends Produce {
    public Pork(int farmPrice,int salePrice){
        this.type = ProduceType.pork;
        this.farmPrice=farmPrice;
        this.salePrice=salePrice;
        ProduceFactory.getInstance().putProduce(this);
        System.out.println("pork initial once");
    }
}