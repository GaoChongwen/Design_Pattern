package produce;

import animal.Pig;
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
        super();
        this.type = ProduceType.pork;
        this.farmPrice=Context.getInstance().pig_salePrice;
        this.salePrice=this.farmPrice*3;
        ProduceFactory.getInstance().createProduce(this.getType());
        System.out.println("pork initial once");
    }
}