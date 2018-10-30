package building.farmland;

import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype
 *
 * @author lipeng liang
 * @version 2018/10/29
 */
public class RiceField extends FarmLand {
    public RiceField() {
        super();
        this.landType = FarmLandType.riceField;
        FarmLandFactory.getInstance().putFarmLand(this);
        System.out.println("RiceField initial once");
    }
}
