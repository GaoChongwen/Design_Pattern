package process;

import factory.ProduceFactory;
import base.Item

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

    public process(Item item){
        ProduceFactory produce = new ProduceFactory();
        produce.getInstance().creatProcude(item.getType());
        return null;
    }
}



