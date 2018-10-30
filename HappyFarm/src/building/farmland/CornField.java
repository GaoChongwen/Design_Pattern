package building.farmland;

import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * @Design-Pattern: Adaptor, Prototype
 * @description: 种植Wheat的土地
 * @author lipeng liang
 * @version 2018/10/29
 */
public class CornField extends FarmLand {
    public CornField() {
        super();
        this.landType = FarmLandType.cornField;
        FarmLandFactory.getInstance().putFarmLand(this);
        System.out.println("CornField initial once");
    }
}
