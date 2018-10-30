package animal;

import base.animal.Animal;
import utils.Context;

public class Cow extends Animal {
    public Cow(){
        super();
        this.setName("cow");
        setStockPrice(Context.getInstance().cow_stockPrice);
        setSalePrice(Context.getInstance().cow_salePrice);
    }
}
