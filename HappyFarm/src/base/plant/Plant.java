package base.plant;


import base.FarmObj;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

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
    protected FarmLandType reqLandType;

    protected Plant(int stockPrice, int salePrice) {
        state = SeedState.getInstance();
    }

    protected void setState(PlantState state) {
        this.state = state;
        System.out.println(type + " changes state to " + this.state + " success!");
    }

    public PlantState getState() {
        return this.state;
    }

    public boolean plant(FarmLandType landType) {
        if (landType == FarmLandType.allField || landType == reqLandType) {
            return state.plant(this);
        }
        return false;
    }

    public void harvest() {
        state.harvest(this);
    }

    public int getStockPrice() {
        return this.stockPrice;
    }

    public int getSalePrice() {
        return this.salePrice;
    }

    @Override
    public String getName() {
        return this.type.toString();
    }

    public FarmLandType getReqLandType() {
        return this.reqLandType;
    }

    public boolean checkLand(FarmLandType landType) {
        return landType == this.reqLandType;
    }

    public boolean checkType(PlantType plantType) {
        return plantType == this.type;
    }

    protected void harvest(int _) {
        System.out.println(this.type + " harvest success.");
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