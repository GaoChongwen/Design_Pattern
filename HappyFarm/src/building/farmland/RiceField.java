package building.farmland;

import factory.FarmLandFactory;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;

/**
 * @Design-Pattern: Adaptor, Prototype
 * @description: 种植Rice的土地类
 * @author lipeng liang
 * @version 2018/10/29
 */
public class RiceField extends FarmLand {
    public RiceField() {
        super();
        this.landType = FarmLandType.riceField;
        FarmLandFactory.getInstance().putFarmLand(this);
        if(DesignPattern== DesignPatternMode.PrototypePattern){
            System.out.println("RiceField initial once");
        }    }
}
