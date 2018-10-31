package building.farmland;

import factory.FarmLandFactory;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;

/**
 * @Design-Pattern: Adaptor, Prototype
 * @description: 种植苹果的土地类
 * @author lipeng liang
 * @version 2018/10/29
 */
public class AppleField extends FarmLand {
    public AppleField() {
        super();
        this.landType = FarmLandType.appleField;
        FarmLandFactory.getInstance().putFarmLand(this);
        if(DesignPattern== DesignPatternMode.PrototypePattern){
            System.out.println("AppleField initial once");
        }    }
}
