package utils.test;

import factory.PlantFactory;
import plant.Apple;
import utils.Context;
import utils.Enum.PlantType;

public class Plant {
    public static void main(String args[]){
        Apple a = new Apple(Context.apple_stockPrice,Context.apple_salePrice);
        Apple a1 = (Apple) PlantFactory.getInstance().createPlant("apple");
        a.getState().plant(a);
        a1.getState().plant(a1);
        a.getState().grow(a);
        a.getState().grow(a);
        a.getState().grow(a);
        a1.getState().grow(a1);
    }
}
