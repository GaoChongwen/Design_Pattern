package propComp.props.landAdaptor;

import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype, Factory Method
 *
 * @author lipeng liang
 * @version 2018/10/29
 */

public class RiceAdaptor extends LandAdaptor {

    public RiceAdaptor() {
        super();
        this.landType = FarmLandType.riceField;
        this.land = FarmLandFactory.getInstance().createFarmLand(landType.toString());
    }
}
