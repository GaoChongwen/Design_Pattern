package animal;

import base.animal.Animal;
import utils.Context;

public class Pig extends Animal {
    public Pig(){
        super();
        setStockPrice(Context.getInstance().pig_stockPrice);
        setSalePrice(Context.getInstance().pig_stockPrice);
    }
}
