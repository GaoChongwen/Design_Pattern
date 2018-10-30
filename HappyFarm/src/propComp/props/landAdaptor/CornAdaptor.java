package propComp.props.landAdaptor;

import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype, Factory Method
 *
 * @author lipeng liang
 * @version 2018/10/29
 */

public class CornAdaptor extends LandAdaptor {

    public CornAdaptor() {
        super();
        this.landType = FarmLandType.cornField;
        this.land = FarmLandFactory.getInstance().createFarmLand(landType.toString());
    }
}
