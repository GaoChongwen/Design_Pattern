package propComp.props.landAdaptor;

import base.Item;
import utils.Enum.FarmLandType;

public abstract class LandAdaptor extends Item implements Cloneable {
    protected boolean used;
    protected FarmLandType landType;

    protected LandAdaptor() {
        this.used = false;
    }

    public FarmLandType getLandType() {
        return this.landType;
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