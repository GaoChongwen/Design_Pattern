package factory;

import propComp.props.landAdaptor.LandAdaptor;

import java.util.Hashtable;
import java.util.Map;

/**
 * @project: HappyFarm
 * @description: 适配器工厂类
 * @Design-Pattern: Factory Method, Prototype, Singleton
 * @version 2018/10/29
 * @author lipeng liang
 *
 */
public class AdaptorFactory extends AbstractFactory {

    /**
     * @Design-Pattern: Singleton
     */
    private volatile static AdaptorFactory singleton = new AdaptorFactory();
    private static Hashtable<String, LandAdaptor> AdaptorMap = new Hashtable<String, LandAdaptor>();

    public static AdaptorFactory getInstance() {
        return singleton;
    }

    /**
     * @Design-Pattern: Factory Method, Prototype
     * @desprition:
     * @param type (String)：Adaptor的类型
     * @return  相应类型的Adaptor
     */
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