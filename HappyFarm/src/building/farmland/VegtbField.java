package building.farmland;

import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Prototype
 *
 * @author lipeng liang
 * @version 2018/10/28
 */
public class VegtbField extends FarmLand {
    public VegtbField() {
        super();
        this.landType = FarmLandType.vegtbField;
        FarmLandFactory.getInstance().putFarmLand(this);
        System.out.println("VegtbField initial once");
    }
}
