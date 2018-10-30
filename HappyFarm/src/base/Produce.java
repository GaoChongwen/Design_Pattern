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

public abstract class Produce extends Item implements Cloneable{
    protected int salePrice;
    protected ProduceType type;

    protected Produce() {
    }

    public int getSalePrice() {
        return this.salePrice;
    }

    public String getName() {
        return this.type.toString();
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
