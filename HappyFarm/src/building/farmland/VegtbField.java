package building.farmland;

import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype
 *
 * @author lipeng liang
 * @version 2018/10/29
 */
public class VegtbField extends FarmLand {
    public VegtbField() {
        super();
        this.landType = FarmLandType.vegtbField;
        FarmLandFactory.getInstance().putFarmLand(this);
        System.out.println("VegtbField initial once");
    }
}
