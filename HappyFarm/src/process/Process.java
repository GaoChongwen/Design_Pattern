package process;

import factory.ProduceFactory;
import base.Item;
import base.Produce;

/**
 * Design-Pattern: Facade,Singleton

 * @version 2018/10/28
 * @author xuan liu
 *
 */

//流程1

//流程2

//流程3

//...

public class Process{

    private volatile static Process singleton = new Process();

    public static Process getInstance() {
        return singleton;
    }

    public Produce process(Item item) {

        Produce produce = ProduceFactory.getInstance().creatProduce(item.getType());

        int price = 0;
        produce.setPrice(price);

        return produce;
    }
}



