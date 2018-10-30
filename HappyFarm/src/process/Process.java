package process;

import factory.ProduceFactory;
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
//生产农副产品
public class Process{

    private volatile static Process singleton = new Process();

    public static Process getInstance() {
        return singleton;
    }

    public Produce process(String type) {

        Produce produce = ProduceFactory.getInstance().creatProduce(type);

        //设定农副产品价格
        int farmPrice = produce.getFarmPrice();
        produce.setSalePrice(farmPrice+10);

        return produce;
    }
}