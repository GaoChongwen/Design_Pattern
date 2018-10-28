package utils.test;

import factory.PlantFactory;
import plant.Apple;
import plant.Wheat;
import utils.Context;
import utils.Enum.PlantType;

public class Factory {
    public static void main(String args[]){
        Wheat w = new Wheat(Context.wheat_stockPrice, Context.wheat_salePrice);
        Apple a = new Apple(Context.apple_stockPrice,Context.apple_salePrice);

        PlantFactory.getInstance().getAllPlant();
        Apple a1 = (Apple)PlantFactory.getInstance().createPlant(PlantType.apple);
        System.out.println("key is"+ a1.getType());

    }
}
