package propComp.props.landAdaptor;

import base.Item;
import base.plant.Plant;
import building.farmland.FarmLand;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype
 *
 * @author lipeng liang
 * @version 2018/10/29
 */

public abstract class LandAdaptor extends Item implements Cloneable {
    protected boolean isUsed;
    protected FarmLandType landType;
    protected FarmLand land;

    protected LandAdaptor() {
        this.isUsed = false;
        this.land = null;
    }

    @Override
    protected void use() {
    }

    public FarmLandType getLandType() {
        return landType;
    }

    @Override
    public String getName() {
        return landType + "Adaptor";
    }


    public boolean plant(Plant plant) {
        if (!isUsed) {
            System.out.println(landType + " adaptor running, changes to " + land.getLandType());
            isUsed = land.plant(plant);
            System.out.println(isUsed ? "worked done." : "worked fail.");
            return isUsed;
        }
        return false;
    }



    public LandAdaptor clone() {
        LandAdaptor clone = null;
        try {
            clone = (LandAdaptor) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}