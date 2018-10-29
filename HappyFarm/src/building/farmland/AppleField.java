package building.farmland;

import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype
 *
 * @author lipeng liang
 * @version 2018/10/29
 */
public class AppleField extends FarmLand {
    public AppleField() {
        super();
        this.landType = FarmLandType.appleField;
        FarmLandFactory.getInstance().putFarmLand(this);
        System.out.println("appleField initial once");
    }
}
