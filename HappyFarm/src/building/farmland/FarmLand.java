package building.farmland;

import base.FarmObj;
import base.plant.Plant;
import propComp.props.landAdaptor.LandAdaptor;
import utils.Enum.FarmLandType;

import java.util.Observable;
import java.util.Observer;

/**
 * Design-Pattern: Prototype, Adaptor
 *
 * @author lipeng liang
 * @version 2018/10/28
 */

public abstract class FarmLand extends FarmObj implements Cloneable, Observer {
    protected FarmLandType landType;
    protected boolean idle;
    protected Plant plant;
    protected LandAdaptor adaptor;

    protected FarmLand() {
        this.idle = true;
        this.adaptor = null;
        this.plant = null;
    }

    public FarmLandType getLandType() {
        return landType;
    }

    @Override
    public String getName() {
        return landType.toString();
    }


    public void use(LandAdaptor landAdaptor) {
        this.adaptor = landAdaptor;
        System.out.println(landType + " Adaptor works.");
    }

    /**
     * @Design-Pattern: Adaptor
     * @param p: 需要种植的植物
     * @description: 如果该植物适合本土地类型，则种植；否则，若
     */
    public void plant(Plant p) {

        if (idle && (p.plant(landType) || (adaptor != null && adaptor.plant(p)))) {
            plant = p;
            idle = false;
        } else {
            System.out.println(landType + " plant " + p.getType() + " fail!");
        }

    }

    public void harvest(Plant p) {
        if (idle) { return; }
        idle = p.harvest();
    }

    /**
     * @Design-Pattern: Observer
     * @description: 作为Clock的观察者，Clock变化，植物更新生长。
     */
    @Override
    public void update(Observable o, Object arg) {
        if (plant == null) {
            return;
        }
        plant.grow();
    }

    /**
     * @Design-Pattern: Prototype
     */
    public FarmLand clone() {
        FarmLand clone = null;
        try {
            clone = (FarmLand) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
