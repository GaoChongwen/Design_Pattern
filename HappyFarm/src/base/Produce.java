package base;

import factory.ProduceFactory;
import utils.Enum.ProduceType;
import base.Item;

/**
 * Design-Pattern: Prototype

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public abstract class Produce extends Item implements Cloneable{
    protected int farmPrice;
    protected int salePrice;
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
        Produce clone;
        try {
            clone = (Produce) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
