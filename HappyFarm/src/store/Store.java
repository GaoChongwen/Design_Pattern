package store;

import base.FarmObj;
import factory.PlantFactory;
import plant.Apple;
import singleton.Farm;
import singleton.MessageBoard;
import singleton.Repository;
import utils.Money.Money;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商店类，接口包括购买商品，添加商品，删除商品
 */
public class Store{
    private volatile static Store singleton = new Store();
    private Map<String,Integer> Commodities = new HashMap<String, Integer>();
    private Map<String, String> Kinds = new HashMap<String, String>();


    public static Store getInstance() { return singleton; }
    private Store(){
        Kinds.put("apple","Plant");
        Kinds.put("wheat","Plant");
        Kinds.put("rice","Plant");
        Kinds.put("cabbage","Plant");
        Kinds.put("sickle","Tool");
        Kinds.put("reaping_machine","Tool");
    }

    //添加商品,指定商品名和添加数量
   public void addCommity(String name , Integer number){
       if(Commodities.containsKey(name)){
            Commodities.put(name, Commodities.get(name)+number);
       }
       else{
           Commodities.put(name, number);
       }
   }
   public boolean sellCommity(String name, Integer number ,Integer price)throws IllegalArgumentException{
        //increase number of Commity
       this.addCommity(name,number);
       //TODO increase money of user
       Money.getInstance().sell(price * number);
       //TODO decline warehouse

        return true;
   }
   public boolean buyCommity(String name, Integer number , Integer price)throws IllegalArgumentException{
       List<FarmObj> result = new ArrayList<FarmObj>();
       //Create Items
       if(Commodities.containsKey(name)){
           //check money
           if(Money.getInstance().buy(name,number,price)) {
               for (Integer i = 0; i < number; i++) {
                   if (Kinds.get(name).equals("Plant")) {
                       result.add(PlantFactory.getInstance().createPlant(name));
                       continue;
                   }
                   if (Kinds.get(name).equals("Tool")) {
                       //TODO wait ToolFactory
                       //result.add(ToolFactory.getInstance().createPlant(name));
                       continue;
                   }
                   throw new IllegalArgumentException();
               }
           }
       }
        else{
            throw new IllegalArgumentException();
       }

       //TODO put into warehouse

       return true;
   }
}