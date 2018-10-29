package propComp.props.landAdaptor;

import utils.Enum.FarmLandType;

public class AllAdaptor extends LandAdaptor {
    protected AllAdaptor(FarmLandType type) {
        super(type);
        this.used = false;
    }
}