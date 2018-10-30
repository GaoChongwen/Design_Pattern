package propComp.props.landAdaptor;

import base.plant.Plant;
import building.farmland.FarmLand;
import factory.AdaptorFactory;
import factory.FarmLandFactory;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype
 * @description: 全能适配器类，可转换种植所有种类的植物
 * @author lipeng liang
 * @version 2018/10/29
 */

public class AllAdaptor extends LandAdaptor {
    public AllAdaptor() {
        super();
        this.landType = FarmLandType.allField;
        AdaptorFactory.getInstance().putAdaptor(this);
    }

    @Override
    public boolean plant(Plant plant) {
        this.land = FarmLandFactory.getInstance().createFarmLand(plant.getReqLandType().toString());
        return super.plant(plant);
    }
}