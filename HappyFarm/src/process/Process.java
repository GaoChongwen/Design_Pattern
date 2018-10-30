package process;

import factory.ProduceFactory;
import base.Produce;
import process.Make;

/**
 * Design-Pattern: Facade,Singleton

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class Process{

    private volatile static Process singleton = new Process();
    public static Process getInstance() {
        return singleton;
    }

    public Produce process(FarmObj obj) {
        return Make.make(obj);
    }
}