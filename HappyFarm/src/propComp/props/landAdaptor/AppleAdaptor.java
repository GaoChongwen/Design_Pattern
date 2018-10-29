package propComp.props.landAdaptor;

import utils.Enum.FarmLandType;

public class AppleAdaptor extends LandAdaptor {

    protected AppleAdaptor() {
        this.landType = FarmLandType.appleField;
        this.used = false;
    }
}
