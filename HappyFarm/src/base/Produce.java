package base;

import factory.ProduceFactory;
import utils.Enum.ProduceType;
import base.FarmObj;

/**
 * Design-Pattern: Prototype

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public abstract class Produce extends FarmObj implements Cloneable{
    private int farmPrice;
    private int salePrice;
    private ProduceType type;

    protected Produce(int farmPrice , int salePrice) {

    }

    protected int getFarmPrice() {
        return this.farmPrice;
    }

    protected int getSalePrice() {
        return this.salePrice;
    }

    protected void setSalePrice(int price){
        this.salePrice = price;
    }

    protected ProduceType getType() {
        return this.type;
    }

    public boolean checkType(ProduceType produceType) {
        return produceType == this.type;
    }

    /**
     * Design-Pattern: Prototype
     */
    public Produce clone() {
        Produce clone = null;
        try {
            clone = (Produce) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;

    }
}
