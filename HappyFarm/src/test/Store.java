package test;


import base.plant.Plant;
import factory.PlantFactory;
import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import utils.Enum.PlantType;

public class Store {
    public static void main(String args[]){
        new Apple();
        new Wheat();
        new Cabbage();
        new Rice();

        Plant plant = PlantFactory.getInstance().createPlant("wheat");
        Plant plant1 = PlantFactory.getInstance().createPlant("apple");
        System.out.println(plant.getSalePrice());
        System.out.println(plant1.getSalePrice());
 }
}
