package animal;

import base.animal.Animal;
import utils.Context;

public class Cow extends Animal {
    private static int index=1;
    public Cow(){
        super();
        this.setName("cow"+index);  index++;
        setStockPrice(Context.getInstance().cow_stockPrice);
        setSalePrice(Context.getInstance().cow_salePrice);
    }
}
