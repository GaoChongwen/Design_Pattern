package building.farmland;

import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * @Design-Pattern: Adaptor, Prototype
 * @description: 种植蔬菜的土地类
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
