package AnimalFood;

import base.animal.Animal;
import building.shed.AnimalHouse;
import base.Item;

/**
 * Design-Pattern: Prototype

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class AnimalFood extends Item {
    protected boolean used;
    //protected int salePrice;

    //遍历 each
    public void use() {

        for(Animal animal : animals){
            animal.eat();
        }
        this.used = true;

    }
}
