package animal;

import base.animal.Animal;
import base.plant.SeedState;
import utils.Context;

public class Pig extends Animal {
    private static int index=1;
    public Pig(){
        super();
        this.setType("pig");
        this.setName("pig"+index);  index++;
        setStockPrice(Context.getInstance().pig_stockPrice);
        setSalePrice(Context.getInstance().pig_stockPrice);
        //System.out.println("a pig has been created");
    }
}
