package factory;

import base.Produce;
import utils.Enum.DesignPatternMode;

import java.util.Hashtable;
import java.util.Map;

/**
 * @project: HappyFarm
 * @description: 加工副产品工厂类
 * @Design-Pattern: Factory Method, Prototype, Singleton
 * @version 2018/10/29
 * @author lipeng liang
 *
 */

public class ProduceFactory extends AbstractFactory {

    /**
     * @Design-Pattern: Singleton
     */
    private volatile static ProduceFactory singleton = new ProduceFactory();
    private static Hashtable<String, Produce> produceMap=new Hashtable<>();
    private static DesignPatternMode designPattern = null;

    public static ProduceFactory getInstance() {
        return singleton;
    }

    /**
     * @Design-Pattern: Factory Method, Prototype
     * @desprition: 创建Produce
     * @param name (String)：Produce的类型
     * @return  相应类型的Produce
     */

    @Override
    public Produce createProduce(String name){
        Produce cachedProduce = produceMap.get(name);
        if (cachedProduce == null) {
            return null;
        }
        if(designPattern== DesignPatternMode.FactoryPattern){
            System.out.println("Factory Pattern | ProduceFactory method: createdProduce(String) -> "+cachedProduce.getName()+" is created by ProduceFactory");
        }
        return cachedProduce.clone();
        
    }
    public void putProduce(Produce produce){
        if(designPattern==DesignPatternMode.FactoryPattern){
            System.out.println("Factory Pattern | ProduceFactory method: putProduce(Produce) -> "+produce.getName()+" is put into ProduceFactory.");
        }
        produceMap.put(produce.getName(),produce);
    }
    public void getAllProduce(){

        for (Map.Entry<String,Produce> entry : produceMap.entrySet()) {
            System.out.println("Factory Pattern | ProduceType = ProduceFactory method: getAllProduce() -> we have " + entry.getKey());
        }

    }
    public static void setDesignPattern(DesignPatternMode designPatter){
        designPattern=designPatter;
    }


}