package test;

import factory.PlantFactory;
import plant.Apple;
import utils.Context;

public class Plant {
    public static void main(String args[]){
        Apple a = new Apple();
        Apple a1 = (Apple) PlantFactory.getInstance().createPlant("apple");


    }
}
