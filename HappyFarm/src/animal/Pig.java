package animal;

import base.animal.Animal;
import utils.Context;

public class Pig extends Animal {
    private static int index=1;
    public Pig(){
        super();
        this.setName("pig"+index);  index++;
        setStockPrice(Context.getInstance().pig_stockPrice);
        setSalePrice(Context.getInstance().pig_stockPrice);
    }
}
