package factory;

import base.produce;
import base.Produce;
import utils.Enum.ProduceType;
import java.util.Hashtable;
import java.util.Map;

/**
 * Design-Pattern: Factory method ,Singleton

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class ProduceFactory extends AbstractFactory {

    private volatile static ProduceFactory singleton = new ProduceFactory();
    private ProduceFactory(){
        produces = new ArrayList<>();
    }

    public static ProduceFactory getInstance() {
        return singleton;
    }

    public int getExactProduceNum(String name){
        int count = 0;
        for(String produce : produces){
            int result = name.compareTo(produce);
            if(result == 0){ count++; }
        }
        return count;
    }

    @Override
    public Produce createProduce(String name){

        //Produce produce = new Produce(name);
        if(name.equals("cow")){
            produces.add("milk");
            return new Milk();
        }
        else if(name.equals("chicken")){
            produces.add("foodChicken");
            return new foodChicken();
        }
        else if(name.equals("pig")){
            produces.add("pork");
            return new Pork();
        }
        else if(name.equals("apple")){
            produces.add("juice");
            return new Juice();
        }
        else if(name.equals("wheat")){
            produces.add("flour");
            return new Flour();
        }
        else if(name.equals("rice")){
            produces.add("foodRice");
            return new foodRice();
        }
        else{
            return null;
        }
    }
}