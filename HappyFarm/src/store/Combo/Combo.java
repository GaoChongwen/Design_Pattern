package store.Combo;

import base.FarmObj;
import base.Item;
import base.animal.Animal;
import base.plant.Plant;
import com.sun.corba.se.impl.oa.toa.TOA;
import factory.AdaptorFactory;
import factory.AnimalFactory;
import factory.PlantFactory;
import person.Employee;
import propComp.props.landAdaptor.LandAdaptor;
import propComp.tools.Tool;


import java.util.ArrayList;
import java.util.List;

/**
 * 支持添加植物，动物，Item，雇员，工具作为套餐
 * 是否需要show方法
 */
public class Combo {
    private String comboName ="";
    private Integer totalPrice = 0;
    private List<Plant>  plants= new ArrayList<Plant>();
    private List<Animal>  animals= new ArrayList<Animal>();
    private List<LandAdaptor>  adaptors= new ArrayList<LandAdaptor>();
    public String getComboName(){
        return comboName;
    }
    public Integer getTotalPrice(){
        return totalPrice;
    }
    public void setComboName(String comboName) {
        this.comboName = comboName;
    }
    public void setPlant(String kind , Integer num , Integer price){
        for(int i=0;i< num ; i++){
            //add Plants
            plants.add(PlantFactory.getInstance().createPlant(kind));
            //add Value
            totalPrice+=price;
        }
    }
    public void setAnimals(String kind , Integer num , Integer price){
        for(int i=0;i< num ; i++){
            this.animals.add(AnimalFactory.getInstance().createAnimal(kind));
            //add Value
            totalPrice+=price;
        }
    }
    public void setAdaptors(String kind , Integer num , Integer price){
        for(int i=0;i< num ; i++){
            //add adaptor
            adaptors.add(AdaptorFactory.getInstance().createAdaptor(kind));
            //add Value
            totalPrice+=price;
        }
    }
    public List<Plant> getPlants(){
        return plants;
    }
    public void showCombo(){
        System.out.println("The Combo concludes");
        System.out.println(plants.size() + " " +plants.get(0).getName());
        System.out.println(animals.size() + " " +animals.get(0).getType());
        System.out.println(adaptors.size() + " " + adaptors.get(0).getLandType());
        System.out.println("total price is "+getTotalPrice());
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<LandAdaptor> getAdaptors(){
        return adaptors;
    }
    public List<Animal> getAnimals(){
        return animals;
    }

}
