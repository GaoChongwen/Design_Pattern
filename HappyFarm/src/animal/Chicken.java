package animal;

import base.animal.Animal;
import utils.Context;

public class Chicken extends Animal {
    private static int index=1;
    public Chicken(){
        super();
        setName("chicken"+index); index++;
        setStockPrice(Context.getInstance().chicken_stockPrice);
        setSalePrice(Context.getInstance().chicken_salePrice);
    }
}
