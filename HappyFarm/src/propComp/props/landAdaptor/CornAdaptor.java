package propComp.props.landAdaptor;

import factory.AdaptorFactory;
import factory.FarmLandFactory;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype, Factory Method
 * @description: 麦田适配器类（一种道具），可使其它类型土地转换种植小麦，使用过后该道具失效
 * @author lipeng liang
 * @version 2018/10/29
 */

public class CornAdaptor extends LandAdaptor {

    public CornAdaptor() {
        super();
        this.landType = FarmLandType.cornField;
        this.land = FarmLandFactory.getInstance().createFarmLand(landType.toString());
        if(DesignPattern== DesignPatternMode.PrototypePattern){
            System.out.println("CornAdaptor initial once");
        }
        AdaptorFactory.getInstance().putAdaptor(this);

    }
}
