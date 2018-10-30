package store;

import base.FarmObj;
import base.animal.Animal;
import base.plant.Plant;
import building.shed.ChickShed;
import building.shed.CowShed;
import factory.AnimalFactory;
import factory.PlantFactory;
import plant.Apple;
import singleton.Farm;
import singleton.MessageBoard;
import singleton.Repository;
import store.Combo.Builder;
import store.Combo.ComboBuilderA;
import store.Combo.ComboBuilderB;
import store.Combo.Director;
import utils.Money.Money;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商店类，接口包括购买商品，添加商品，删除商品
 */
public class Store {
    private volatile static Store singleton = new Store();
    private Map<String, Integer> Commodities = new HashMap<String, Integer>();
    private Map<String, String> Kinds = new HashMap<String, String>();


    private Builder builder = new ComboBuilderA();


    public static Store getInstance() {
        return singleton;
    }

    private Store() {
        Kinds.put("apple", "Plant");
        Kinds.put("wheat", "Plant");
        Kinds.put("rice", "Plant");
        Kinds.put("cabbage", "Plant");
        Kinds.put("sickle", "Tool");
        Kinds.put("wheatReapingMachine", "Tool");
        Kinds.put("reapingMachine", "Tool");
        Kinds.put("cow", "Animal");
        Kinds.put("chicken", "Animal");
        Kinds.put("pig", "Animal");
    }

    //添加商品,指定商品名和添加数量
    public void addCommity(String name, Integer number) {
        if (Commodities.containsKey(name)) {
            Commodities.put(name, Commodities.get(name) + number);
        } else {
            Commodities.put(name, number);
        }
    }

    public boolean sellCommity(String name) throws IllegalArgumentException {
        if (Kinds.get(name).equals("Plant")) {
            Plant plant = PlantFactory.getInstance().createPlant(name);
            Money.getInstance().sell(plant.getSalePrice());
        } else if (Kinds.get(name).equals("Animal")) {
            Animal animal = AnimalFactory.getInstance().createAnimal(name);
            Money.getInstance().sell(animal.getSalePrice());
        } else {
            return false;
        }

        return true;
    }
    public boolean buyCommity(String name, Integer number) throws IllegalArgumentException {
        List<FarmObj> result = new ArrayList<FarmObj>();
        //Create Items
        if (Commodities.containsKey(name)) {
            Money.getInstance().buy(name , number ,PlantFactory.getInstance().createPlant(name).getStockPrice());
            if (Kinds.get(name).equals("Plant")) {
                result.add(PlantFactory.getInstance().createPlant(name));
            }
            else if (Kinds.get(name).equals("Tool")) {
                //TODO wait ToolFactory
                //result.add(ToolFactory.getInstance().createPlant(name));
            }
            else if (Kinds.get(name).equals("Animal")) {
                Animal animal = AnimalFactory.getInstance().createAnimal(name);
                if(name.equals("pig")){

                }
                else if (name.equals("cow")){
                    //TODO
 //                   CowShed.getInstance().add();
                }
                else if(name.equals("chicken")){
                    //TODO
 //                   ChickShed.getInstance().add();
                }
            }
            else if (Kinds.get(name).equals("Adaptor")) {

            }
            throw new IllegalArgumentException();
        }
    return true;
}
//买套餐
   public boolean buyCombo(Integer id){
       Director director =new Director();
       if(id.equals(1)){
           //解压Animals
           for (Animal animal:builder.getCombo().getAnimals()
                ) {
               ChickShed.getInstance().addAnimal(animal);
           }
       }
       else if(id.equals(2)){
          builder = new ComboBuilderB();
           for (Animal animal:builder.getCombo().getAnimals()
           ) {
               CowShed.getInstance().addAnimal(animal);
           }
       }
       else{
           return false;
       }
       //decline money
       Money.getInstance().buy("Combo",1,builder.getCombo().getTotalPrice());
       //store Plant
       for (Plant plant:builder.getCombo().getPlants()
            ) {
           Repository.getInstance().add(plant);
       }
       //TODO store other thing
        return true;
   }
}