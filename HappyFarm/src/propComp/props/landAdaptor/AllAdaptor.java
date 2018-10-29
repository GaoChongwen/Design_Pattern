package propComp.props.landAdaptor;

import base.plant.Plant;
import building.farmland.FarmLand;
import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype
 *
 * @author lipeng liang
 * @version 2018/10/29
 */

public class AllAdaptor extends LandAdaptor {
    public AllAdaptor() {
        super();
        this.landType = FarmLandType.allField;
    }

    @Override
    public boolean plant(Plant plant) {
        this.land = FarmLandFactory.getInstance().createFarmLand(plant.getReqLandType().toString());
        return super.plant(plant);
    }
}