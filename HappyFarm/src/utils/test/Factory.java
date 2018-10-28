package utils.test;

import factory.PlantFactory;
import plant.Apple;
import plant.Wheat;
import utils.Context;

public class Factory {
    public static void main(String args[]){
        Wheat w = new Wheat(Context.wheat_stockPrice, Context.wheat_salePrice);
        Apple a = new Apple(Context.apple_stockPrice,Context.apple_salePrice);

        PlantFactory.getInstance().getAllPlant();
    }
}
