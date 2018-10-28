package building.farmland;

import base.FarmObj;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Prototype
 * @project: HappyFarm
 * @author lipeng liang
 * @version 2018/10/28
 */
public abstract class FarmLand extends FarmObj implements Cloneable {
    protected int price;
    protected FarmLandType type;


    protected FarmLand(int price) {
    }

    public int getPrice() {
        return this.price;
    }

    public FarmLandType getType() {
        return this.type;
    }

    /**
     * Design-Pattern: Prototype
     */
    public FarmLand clone() {
        FarmLand clone = null;
        try {
            clone = (FarmLand) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
