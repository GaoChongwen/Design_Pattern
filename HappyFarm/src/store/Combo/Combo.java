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
import propComp.tools.Tool;


import java.util.ArrayList;
import java.util.List;

/**
 * 支持添加植物，动物，Item，雇员，工具作为套餐
 * 是否需要show方法
 */
public class Combo {
    private String comboName;
    private Integer totalPrice = 0;
    private List<Plant>  plants= new ArrayList<Plant>();
    private List<Animal>  animals= new ArrayList<Animal>();
    private List<Item>  adaptors= new ArrayList<Item>();
    private List<Tool>  tools= new ArrayList<Tool>();
    private List<Employee>  employees= new ArrayList<Employee>();
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
            //TODO add animal
            // animals.add(AnimalFactory.getInstance().createPlant(kind));
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
    public void setTools(String kind , Integer num , Integer price){
        for(int i=0;i< num ; i++){
            //TODO add tool
            //tools.add(.getInstance().createAdaptor(kind));
            //add Value
            totalPrice+=price;
        }
    }
    //TODO complete Employees
    public void setEmployees(){}
    public List<Plant> getPlants(){
        return plants;
    }
    //TODO Show Combo
    public void showCombo(){
        System.out.println("套餐中含有");
        System.out.println(plants.size() + "个" +plants.get(0).getType());
        System.out.println(animals.size() + "个" +animals.get(0).getType());
        System.out.println("总价为"+getTotalPrice());
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Item> getAdaptors(){
        return adaptors;
    }
    public List<Tool> getTools(){
        return tools;
    }
    public List<Animal> getAnimals(){
        return animals;
    }
    public List<Employee> getEmployees(){
        return employees;
    }

}
