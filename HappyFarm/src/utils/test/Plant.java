package utils.test;

import factory.PlantFactory;
import plant.Apple;
import utils.Context;

public class Plant {
    public static void main(String args[]){
        Apple a = new Apple(Context.apple_stockPrice,Context.apple_salePrice);
        Apple a1 = (Apple) PlantFactory.getInstance().createPlant("apple");


    }
}
