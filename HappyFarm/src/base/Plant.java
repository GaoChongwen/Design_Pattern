package base;


import factory.PlantFactory;
import utils.Enum.PlantType;
import utils.state.plantState.PlantState;

/**
 * Design-Pattern: State, Prototype
 *
 * @author lipeng liang
 * @version 2018/10/28
 */


public abstract class Plant extends FarmObj implements Cloneable {
    protected PlantState state;
    protected int stockPrice;
    protected int salePrice;
    protected PlantType type;

    protected Plant(int stockPrice, int salePrice) {
    }

    public void setState(PlantState state) {
        this.state = state;
    }

    public PlantState getState() {
        return this.state;
    }

    public void die() {

    }

    public int getStockPrice() {
        return this.stockPrice;
    }

    public int getSalePrice() {
        return this.salePrice;
    }

    public PlantType getType() {
        return this.type;
    }

    /**
     * Design-Pattern: Prototype
     */
    public Plant clone() {
        Plant clone = null;
        try {
            clone = (Plant) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}