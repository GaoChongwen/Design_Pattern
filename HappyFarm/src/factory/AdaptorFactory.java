package factory;

import propComp.props.landAdaptor.LandAdaptor;
import utils.Enum.FarmLandType;

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
    private static Hashtable<FarmLandType, LandAdaptor> AdaptorMap = new Hashtable<FarmLandType, LandAdaptor>();


    public static AdaptorFactory getInstance() {
        return singleton;
    }

    @Override
    public LandAdaptor createAdaptor(FarmLandType type) {
        LandAdaptor cachedAdaptor = AdaptorMap.get(type);
        if (cachedAdaptor == null) {
            return null;
        }
        return cachedAdaptor.clone();
    }

    public void putAdaptor(LandAdaptor Adaptor){
        System.out.println("in put Adaptor");
        AdaptorMap.put(Adaptor.getLandType(),Adaptor);
    }

    public void getAllAdaptor(){

        for (Map.Entry<FarmLandType,LandAdaptor> entry : AdaptorMap.entrySet()) {
            System.out.println("AdaptorType = " + entry.getKey() + ", Adaptor = " + entry.getValue().getLandType());
        }

    }


}