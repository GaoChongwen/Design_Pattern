package factory;

import propComp.props.landAdaptor.LandAdaptor;

import java.util.Hashtable;
import java.util.Map;

/**
 * Design-Pattern: Factory Method, Prototype, Singleton
 *
 * @version 2018/10/29
 * @author lipeng liang
 *
 */
public class AdaptorFactory extends AbstractFactory {


    private volatile static AdaptorFactory singleton = new AdaptorFactory();
    private static Hashtable<String, LandAdaptor> AdaptorMap = new Hashtable<String, LandAdaptor>();


    public static AdaptorFactory getInstance() {
        return singleton;
    }

    @Override
    public LandAdaptor createAdaptor(String type) {
        LandAdaptor cachedAdaptor = AdaptorMap.get(type);
        if (cachedAdaptor == null) {
            return null;
        }
        return cachedAdaptor.clone();
    }

    public void putAdaptor(LandAdaptor Adaptor){
        System.out.println("in put Adaptor");
        AdaptorMap.put(Adaptor.getLandType().toString(),Adaptor);
    }

    public void getAllAdaptor(){

        for (Map.Entry<String,LandAdaptor> entry : AdaptorMap.entrySet()) {
            System.out.println("AdaptorType = " + entry.getKey() + ", Adaptor = " + entry.getValue().getLandType());
        }

    }


}