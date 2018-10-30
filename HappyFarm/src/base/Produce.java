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
    protected int farmPrice;
    protected int salePrice;
    protected ProduceType type;

    protected Produce() {
        //this.type = type;
        farmPrice = 0;
        salePrice = 0;
    }

    public int getFarmPrice() {
        return this.farmPrice;
    }

    public int getSalePrice() {
        return this.salePrice;
    }

    public void setSalePrice(int price){
        this.salePrice = price;
    }

    public ProduceType getType() {
        return this.type;
    }

    public boolean checkType(ProduceType produceType) {
        return produceType == this.type;
    }

    /**
     * @Design-Pattern: Prototype
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
