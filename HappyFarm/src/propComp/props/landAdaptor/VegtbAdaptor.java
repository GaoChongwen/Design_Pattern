package propComp.props.landAdaptor;

import factory.AdaptorFactory;
import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype, Factory Method
 * @description: 蔬菜适配器类（一种道具），可使任何土地转换种植白菜，使用过后该道具失效
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
