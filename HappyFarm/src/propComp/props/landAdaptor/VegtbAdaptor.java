package propComp.props.landAdaptor;

import factory.AdaptorFactory;
import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype, Factory Method
 *
 * @author lipeng liang
 * @version 2018/10/29
 */

public class VegtbAdaptor extends LandAdaptor {

    public VegtbAdaptor() {
        super();
        this.landType = FarmLandType.vegtbField;
        this.land = FarmLandFactory.getInstance().createFarmLand(landType.toString());
        AdaptorFactory.getInstance().putAdaptor(this);
    }
}
