package propComp.props.landAdaptor;

import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

public class AppleAdaptor extends LandAdaptor {

    public AppleAdaptor() {
        super();
        this.landType = FarmLandType.appleField;
        this.land = FarmLandFactory.getInstance().createFarmLand(landType.toString());
    }
}
