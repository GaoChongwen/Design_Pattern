package animal;

import base.animal.Animal;
import utils.Context;

public class Chicken extends Animal {
    private static int index=1;  //静态索引，区分名称
    public Chicken(){
        super();
        setType("chicken");
        setName("chicken"+index); index++;
        setStockPrice(Context.getInstance().chicken_stockPrice);
        setSalePrice(Context.getInstance().chicken_salePrice);
        //System.out.println("a chicken has been created");
    }
}
