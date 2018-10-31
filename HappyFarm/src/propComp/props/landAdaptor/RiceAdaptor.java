package propComp.props.landAdaptor;

import factory.AdaptorFactory;
import factory.FarmLandFactory;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype, Factory Method
 * @description: 稻田适配器类（一种道具），可使任何土地转换种植水稻，使用过后该道具失效
 * @author lipeng liang
 * @version 2018/10/29
 */

public class RiceAdaptor extends LandAdaptor {

    public RiceAdaptor() {
        super();
        this.landType = FarmLandType.riceField;
        this.land = FarmLandFactory.getInstance().createFarmLand(landType.toString());
        if(DesignPattern== DesignPatternMode.PrototypePattern) {
            System.out.println("RiceAdaptor initial once");
        }
            AdaptorFactory.getInstance().putAdaptor(this);
    }
}
