package base;

import factory.ProduceFactory;
import utils.Enum.ProduceType;

/**
 * Design-Pattern: Prototype

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public abstract class Produce {
    protected int farmPrice;
    protected int salePrice;
    private ProduceType type;

    protected Produce(int farmPrice , int salePrice) {

    }

    public int getFarmPrice() {
        return this.farmPrice;
    }

    public int getSalePrice() {
        return this.salePrice;
    }

   // public int setSalePrice(){
   //     return this.salePrice;
   // }

    public ProduceType getType() {
        return this.type;
    }

    public boolean checkType(ProduceType produceType) {
        return produceType == this.type;
    }

    /**
     * Design-Pattern: Prototype
     */
    public Produce clone() {
        Produce clone;
        try {
            clone = (Produce) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
