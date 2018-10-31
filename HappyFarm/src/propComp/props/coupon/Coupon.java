package propComp.props.coupon;

import base.FarmObj;
import base.Item;
import plant.Cabbage;
import utils.Enum.PlantType;

/**
 * @Design-Pattern: Prototype
 * @description: 兑换券类，继承Item
 * @version 2018/10/30
 * @author jihao luo
 *
 */

public abstract class Coupon extends Item implements Cloneable {
    protected PlantType plantType;//planttype代表所对应的券

    public PlantType getPlantType() {
        return plantType;
    }

    public void setPlantType(PlantType plantType) {
        this.plantType = plantType;
    }

    //clone 克隆实例
    public Coupon clone() {
        Coupon clone = null;
        try {
            clone = (Coupon) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
