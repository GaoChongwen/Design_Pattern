package factory;

import propComp.props.landAdaptor.LandAdaptor;
import utils.Enum.DesignPatternMode;

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
    private static DesignPatternMode designPattern = null;

    public static AdaptorFactory getInstance() {
        return singleton;
    }

    /**
     * @Design-Pattern: Factory Method, Prototype
     * @desprition: 创建Adaptor
     * @param type (String)：Adaptor的类型
     * @return  相应类型的Adaptor
     */

    @Override
    public LandAdaptor createAdaptor(String type) {
        LandAdaptor cachedAdaptor = AdaptorMap.get(type);
        if (cachedAdaptor == null) {
                return null;
        }
        if(designPattern== DesignPatternMode.FactoryPattern){
            System.out.println("Factory Pattern | AdaptorFactory method: createdAdaptor(String) -> "+cachedAdaptor.getName()+" is created by AdaptorFactory");
        }
        return cachedAdaptor.clone();
    }

    public void putAdaptor(LandAdaptor Adaptor)
    {
        if(designPattern==DesignPatternMode.FactoryPattern){
            System.out.println("Factory Pattern | AdaptorFactory method: putAdaptor(Adaptor) -> "+Adaptor.getName()+" is put into AdaptorFactory.");
        }
        AdaptorMap.put(Adaptor.getLandType().toString(),Adaptor);
    }

    public boolean checkAdaptor(String Adaptor){
        if(AdaptorMap.get(Adaptor)==null){
            return false;
        }
        return true;
    }
    public void getAllAdaptor(){

        for (Map.Entry<String,LandAdaptor> entry : AdaptorMap.entrySet()) {
            System.out.println("Factory Pattern | AdaptorType = AdaptorFactory method: getAllAdaptor() -> we have " + entry.getKey()+"Adaptor" );
        }

    }

    public static void setDesignPattern(DesignPatternMode designPatter){
        designPattern=designPatter;
    }

}