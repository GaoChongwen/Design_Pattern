package building.farmland;

import base.Item;
import base.plant.Plant;
import propComp.props.landAdaptor.LandAdaptor;
import utils.Enum.FarmLandType;
import utils.test.Adaptor;

/**
 * Design-Pattern: Prototype, Adaptor
 *
 * @author lipeng liang
 * @version 2018/10/28
 */

public abstract class FarmLand extends Item implements Cloneable {
    protected FarmLandType landType;
    protected boolean idle;
    protected Plant plant;
    protected LandAdaptor adaptor;

    protected FarmLand() {
        this.idle = true;
        this.adaptor = null;
        this.plant = null;
    }

    public FarmLandType getLandType() {
        return landType;
    }

    /**
     * @param p
     * @return
     * @DesignPattern: Adaptor
     */

    public void setAdaptor(LandAdaptor landAdaptor) {
        this.adaptor = landAdaptor;
    }

    public boolean plant(Plant p) {

        if (idle && ((p.plant(landType)) || (adaptor != null && adaptor.plant(p)))) {
            plant = p;
            idle = false;
            System.out.println(landType + " plant " + p.getType() + "success!");
            return true;
        } else {
            System.out.println(landType + " plant " + p.getType() + "fail!");
            return false;
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
