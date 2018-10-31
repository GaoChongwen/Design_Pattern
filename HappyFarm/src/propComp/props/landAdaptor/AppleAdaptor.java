package propComp.props.landAdaptor;

import factory.AdaptorFactory;
import factory.FarmLandFactory;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype, Factory Method
 * @description: 苹果适配器类（一种道具），可使任何类型土地转换种植苹果，使用过后该道具失效
 * @author lipeng liang
 * @version 2018/10/29
 */

public class AppleAdaptor extends LandAdaptor {

    public AppleAdaptor() {
        super();
        this.landType = FarmLandType.appleField;
        this.land = FarmLandFactory.getInstance().createFarmLand(landType.toString());
        if(DesignPattern== DesignPatternMode.PrototypePattern){
            System.out.println("AppleAdaptor initial once");
        }
        AdaptorFactory.getInstance().putAdaptor(this);
    }
}
