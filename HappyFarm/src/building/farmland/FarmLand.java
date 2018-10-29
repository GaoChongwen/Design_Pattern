package building.farmland;

import base.Item;
import base.plant.Plant;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Prototype
 *
 * @author lipeng liang
 * @version 2018/10/28
 */

public class FarmLand extends Item implements Cloneable {
    protected FarmLandType landType;
    protected boolean idle;
    protected Plant plant;

    protected FarmLand() {
        this.idle = true;
    }

    public FarmLandType getLandType() {
        return landType;
    }

    public void plant(Plant p) {
        if (idle && p.plant(landType)) {
            plant = p;
            idle = false;
            System.out.println(landType + " plant " + p.getType() + "success!");
        } else {
            System.out.println(landType + " plant " + p.getType() + "fail!");
        }
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
