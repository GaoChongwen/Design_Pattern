package produce;

import plant.Cabbage;
import base.Produce;
import factory.ProduceFactory;
import utils.Enum.ProduceType;

/**
 * Design-Pattern: Prototype

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class AnimalFood extends Produce {
    public AnimalFood(int farmPrice,int salePrice){
        //super(farmPrice,salePrice);
        this.type = ProduceType.AnimalFood;
        this.farmPrice=farmPrice;
        this.salePrice=salePrice;
        ProduceFactory.getInstance().putProduce(this);
        System.out.println("AnimalFood initial once");
    }
}
