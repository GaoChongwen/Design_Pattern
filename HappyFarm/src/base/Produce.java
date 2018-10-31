package base;

import factory.ProduceFactory;
import utils.Enum.DesignPatternMode;
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
    protected DesignPatternMode DesignPattern;


    protected Produce() {
        DesignPattern=null;
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

    public void setDesignPattern(DesignPatternMode designPattern){
        DesignPattern=designPattern;
    }

}
