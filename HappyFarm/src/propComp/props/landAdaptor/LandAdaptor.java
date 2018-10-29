package propComp.props.landAdaptor;

import base.Item;
import base.plant.Plant;
import building.farmland.FarmLand;
import utils.Enum.FarmLandType;

public abstract class LandAdaptor extends Item implements Cloneable {
    protected boolean used;
    protected FarmLandType landType;
    protected FarmLand land;

    protected LandAdaptor() {
        this.used = false;
        this.land = null;
    }

    @Override
    protected void use() {
    }

    public FarmLandType getLandType() {
        return landType;
    }

    public void use(FarmLand land) {
        this.land = land;
//        this.land.setAdaptor(this);
        System.out.println(landType + " Adaptor works.");
    }

    public FarmLandType getAdaptorType() {
        return this.landType;
    }


    public boolean plant(Plant plant) {
        if (!used) {
            System.out.println(landType + " adaptor running, changes to " + land.getLandType());
            used = land.plant(plant);
            System.out.println(used ? "worked done." : "worked fail.");
            return used;
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