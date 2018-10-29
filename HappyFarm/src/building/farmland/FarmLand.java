package building.farmland;

import base.ClockObserver;
import base.Item;
import base.plant.Plant;
import propComp.props.landAdaptor.LandAdaptor;
import utils.Enum.FarmLandType;

import java.util.Observable;

/**
 * Design-Pattern: Prototype, Adaptor
 *
 * @author lipeng liang
 * @version 2018/10/28
 */

public abstract class FarmLand extends ClockObserver implements Cloneable {
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

    @Override
    protected void use() { }


    public void use(LandAdaptor landAdaptor) {
        this.adaptor = landAdaptor;
        System.out.println(landType + " Adaptor works.");
    }

    public boolean plant(Plant p) {

        if (idle && (p.plant(landType) ||(adaptor != null && adaptor.plant(p)))) {
            plant = p;
            idle = false;
            System.out.println(landType + " plant " + p.getType() + "success!");
            return true;
        } else {
            System.out.println(landType + " plant " + p.getType() + "fail!");
            return false;
        }

    }

    @Override
    public void update(Observable o, Object arg) {
        if(plant==null){
            return;
        }
        plant.grow();
    }

    /**
     * Design-Pattern: Prototype
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
