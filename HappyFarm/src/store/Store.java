package store;

import base.Item;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store{

   private Map<String,Integer> Commodities = new HashMap<String, Integer>();
    //添加商品,指定商品名和添加数量
   public void addCommity(String name , Integer number){
       if(Commodities.containsKey(name)){
            Commodities.put(name, Commodities.get(name)+number);
       }
       else{
           Commodities.put(name, number);
       }
   }

   public List<Item> getCommity(String name, Integer number){
       List<Item> result = new ArrayList<Item>();
       if(Commodities.containsKey(name)){

       }
       return result;
   }
}