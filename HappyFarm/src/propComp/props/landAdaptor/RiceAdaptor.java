package propComp.props.landAdaptor;

import factory.AdaptorFactory;
import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype, Factory Method
 * @description: 稻田适配器类，可转换种植水稻
 * @author lipeng liang
 * @version 2018/10/29
 */

public class RiceAdaptor extends LandAdaptor {

    public RiceAdaptor() {
        super();
        this.landType = FarmLandType.riceField;
        this.land = FarmLandFactory.getInstance().createFarmLand(landType.toString());
        AdaptorFactory.getInstance().putAdaptor(this);
    }
}
