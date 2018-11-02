package store;

import base.FarmObj;
import base.animal.Animal;
import base.plant.Plant;
import building.shed.ChickShed;
import building.shed.CowShed;
import factory.*;
import person.Employee;
import plant.Apple;
import propComp.PropDir.Prop;
import propComp.props.landAdaptor.LandAdaptor;
import propComp.tools.Tool;
import singleton.Farm;
import singleton.MessageBoard;
import singleton.Repository;
import store.Combo.Builder;
import store.Combo.ComboBuilderA;
import store.Combo.ComboBuilderB;
import store.Combo.Director;
import utils.Context;
import utils.Enum.EmployeeSkill;
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
    private Map<String, String> Kinds = new HashMap<String, String>();
    private Map<String,String> employeesName = new HashMap<String, String>();
    private Map<String,EmployeeSkill> employeesSkill = new HashMap<String, EmployeeSkill>();
    private Map<String,Integer> employeesSalary = new HashMap<String, Integer>();

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
        Kinds.put("reapingMachine", "Tool");
        Kinds.put("cow", "Animal");
        Kinds.put("chicken", "Animal");
        Kinds.put("appleField", "Adaptor");
        Kinds.put("vegtbField", "Adaptor");
        Kinds.put("riceField", "Adaptor");
        Kinds.put("cornField", "Adaptor");
        Kinds.put("allField", "Adaptor");
        Kinds.put("milk", "ProduceType");
        Kinds.put("cookedFood", "ProduceType");
        Kinds.put("animalFood", "ProduceType");
        employeesName.put("firstLi","firstLi");
        employeesName.put("secondLi","firstLi");
        employeesName.put("thirdLi","thirdLi");
        employeesSkill.put("firstLi",EmployeeSkill.breeding);
        employeesSkill.put("secondLi",EmployeeSkill.breeding);
        employeesSkill.put("thirdLi",EmployeeSkill.cultivation);
        employeesSalary.put("firstLi",200);
        employeesSalary.put("secondLi",300);
        employeesSalary.put("thirdLi",400);
    }

    //向商店出售商品
    public boolean sellCommity(String name) throws IllegalArgumentException {
        if (Kinds.get(name).equals("Plant")) {
            Plant plant = PlantFactory.getInstance().createPlant(name);
            Money.getInstance().sell(plant.getSalePrice());
        } else if (Kinds.get(name).equals("Animal")) {
            Animal animal = AnimalFactory.getInstance().createAnimal(name);
            Money.getInstance().sell(animal.getSalePrice());
        } else if (Kinds.get(name).equals("ProduceType")) {
            Money.getInstance().sell(ProduceFactory.getInstance().createProduce(name).getSalePrice());
        }
        else{
                return false;
        }

        return true;
    }
    //从商店购买商品
    public boolean buyCommity(String name, Integer number) throws IllegalArgumentException {
        //Create Items
        for(Integer i=0 ;i <number;i++) {
            if(name.equals("firstLi") || name.equals("secondLi") || name.equals("thirdLi")){
                Employee employee = EmployeeFactory.getInstance().createEmployee(employeesName.get(name),employeesSkill.get(name),employeesSalary.get(name));
                if(employee == null)
                {
                    System.out.println("Failed , because you did't initialize");
                    return false;
                }
                System.out.println("Successful purchase of " +name );
            }
            if (Kinds.containsKey(name)) {
                if (Kinds.get(name).equals("Plant")) {
                    Plant plant =PlantFactory.getInstance().createPlant(name);
                    if(plant == null)
                    {
                        System.out.println("Failed , Failed , because you did't initialize");
                        return false;
                    }
                    Money.getInstance().buy(name, 1, plant.getStockPrice());
                    Repository.getInstance().add((plant));
                } else if (Kinds.get(name).equals("Tool")) {
                    Tool tool =ToolFactory.getInstance().createTool(name);
                    if(tool == null)
                    {
                        System.out.println("Failed , Failed , because you did't initialize");
                        return false;
                    }
                    Money.getInstance().buy(name, 1, 1000);
                   Farm.getInstance().putIntoToolBag(tool);
                } else if (Kinds.get(name).equals("Animal")) {
                    Money.getInstance().buy(name, 1, AnimalFactory.getInstance().createAnimal(name).getStockPrice());
                    if (name.equals("cow")) {
                        CowShed.getInstance().add();
                    } else if (name.equals("chicken")) {
                        ChickShed.getInstance().add();
                    }
                } else if (Kinds.get(name).equals("Adaptor")) {
                    LandAdaptor adaptor =AdaptorFactory.getInstance().createAdaptor(name);
                    if(adaptor == null)
                    {
                        System.out.println("Failed , Failed , because you did't initialize");
                        return false;
                    }
                    Money.getInstance().buy(name, 1, 200);
                    Prop.addAdaptor(adaptor);
                }
                System.out.println("Successful purchase of " +name );
            }
            else{
                System.out.println("Fail to purchase of " +name +" because "+name +" is not belong to commodity");
            }
        }
    return true;
}
//展示商店
    public void show(){
//        System.out.println("The following items can be sold to the store.");
//        System.out.println("Plant: Wheat        Apple       Cabbage     Rice");
//        System.out.println("Price: "+Context.wheat_salePrice+"         "+Context.apple_salePrice+"        "+Context.cabbage_salePrice+"        "+Context.rice_salePrice);
//        System.out.println("Animal: Cow     Chicken");
//        System.out.println("Price: " + Context.cow_salePrice+"      "+Context.chicken_salePrice);
//        System.out.println("Produce:Milk       CookedFood      AnimalFood");
//        System.out.println("Price:  " + Context.milk_price +"        " + Context.cookedFood_price + "           "+Context.animalFood_price);
        System.out.println("==================================================");
        System.out.println("The following items can be purchased to the store.");
        System.out.println("==================================================");
        System.out.println("Plant:  1.wheat       2.apple      3.cabbage    4.rice");
        System.out.println("Price:  "+Context.wheat_stockPrice+"            "+Context.apple_stockPrice+"           "+Context.cabbage_stockPrice+"           "+Context.rice_stockPrice);
        System.out.println("**************************************************");
        System.out.println("Animal: 5.cow         6.chicken");
        System.out.println("Price:  " + Context.cow_stockPrice+"           "+Context.chicken_stockPrice);
        System.out.println("**************************************************");
        System.out.println("Adaptor:7.appleField  8.vegtbField 9.riceField  10.cornField       11.allField");
        System.out.println("Price:  200           200          200          200                200");
        System.out.println("**************************************************");
        System.out.println("Employee: 12         13            14");
        System.out.println("Name:    firstLi    secondLi      thirdLi");
        System.out.println("Skill:  "+employeesSkill.get("firstLi") +"    "+employeesSkill.get("secondLi")+"       "+employeesSkill.get("thirdLi"));
        System.out.println("Price:      "+employeesSalary.get("firstLi")+"       "+employeesSalary.get("secondLi")+"             "+employeesSalary.get("thirdLi"));
        System.out.println("==================================================");
    }
//买套餐
public boolean buyCombo(Integer id){
       Director director =new Director();
       if(id.equals(1)){
           director.ConstructBuild(builder);
           //解压Animals
           for (Animal animal:builder.getCombo().getAnimals()
                ) {
               ChickShed.getInstance().addAnimal(animal);
           }
       }
       else if(id.equals(2)){
          builder = new ComboBuilderB();
          director.ConstructBuild(builder);
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
    for (LandAdaptor adaptor: builder.getCombo().getAdaptors()
         ) {
        Prop.addAdaptor(adaptor);
    }
        return true;
   }
}