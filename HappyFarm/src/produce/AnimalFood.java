package produce;

import plant.Wheat;
import base.Produce;
import factory.ProduceFactory;
import utils.Enum.ProduceType;
import utils.Context;

/**
 * Design-Pattern: Prototype
 *
 * @author xuan liu
 * @version 2018/10/28
 */

public class AnimalFood extends Produce {
    public AnimalFood() {
        this.type = ProduceType.animalFood;
        this.salePrice = Context.animalFood_price;
        ProduceFactory.getInstance().putProduce(this);
    }
}
