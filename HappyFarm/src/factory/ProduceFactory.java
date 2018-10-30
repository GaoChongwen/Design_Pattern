package factory;

//import produce.Juice;
import base.Produce;
import utils.Enum.ProduceType;
import java.util.Hashtable;
import java.util.Map;

/**
 * Design-Pattern: Factory mathod,Singleton

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class ProduceFactory extends AbstractFactory {

    private volatile static ProduceFactory singleton = new ProduceFactory();
    private static Hashtable<String, Produce> produceMap = new Hashtable<String, Produce>();

    public static ProduceFactory getInstance() {
        return singleton;
    }

    @Override
    public Produce createProduce(String type){
        Produce cachedProduce = produceMap.get(type);
        if (cachedProduce == null) {
            return null;
        }
        return cachedProduce.clone();
    }

    public void putProduce(Produce produce){
        System.out.println("in put produce");
        produceMap.put(produce.getName(),produce);
    }
}