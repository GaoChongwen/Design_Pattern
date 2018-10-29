package propComp.props.landAdaptor;

import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

public class AllAdaptor extends LandAdaptor {
    public AllAdaptor() {
        super();
        this.landType = FarmLandType.allField;
        this.land = FarmLandFactory.getInstance().createFarmLand(landType.toString());
    }
}