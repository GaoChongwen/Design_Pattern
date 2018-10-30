package animal;

import base.animal.Animal;
import utils.Context;

public class Chicken extends Animal {
    public Chicken(){
        super();
        setName("chicken");
        setStockPrice(Context.getInstance().chicken_stockPrice);
        setSalePrice(Context.getInstance().chicken_salePrice);
    }
}
