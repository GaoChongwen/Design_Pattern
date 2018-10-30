package factory;

import base.Produce;
import java.util.Hashtable;

/**
 * Design-Pattern: Factory method ,Singleton

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class ProduceFactory extends AbstractFactory {

    private volatile static ProduceFactory singleton = new ProduceFactory();
    private static Hashtable<String, Produce> produceMap=new Hashtable<>();
    private ProduceFactory(){ }

    public static ProduceFactory getInstance() {
        return singleton;
    }

    public void putProduce(Produce produce){
        produceMap.put(produce.getName(),produce);
    }
    @Override
    public Produce createProduce(String name){
        Produce cachedProduce = produceMap.get(name);
        if (cachedProduce == null) {
            return null;
        }
        return cachedProduce.clone();
        
    }
}