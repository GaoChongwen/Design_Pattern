package building.farmland;

import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Prototype
 *
 * @author lipeng liang
 * @version 2018/10/28
 */
public class CornField extends FarmLand {
    public CornField() {
        super();
        this.landType = FarmLandType.cornField;
        FarmLandFactory.getInstance().putFarmLand(this);
        System.out.println("CornField initial once");
    }
}
