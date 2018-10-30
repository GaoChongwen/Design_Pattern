package propComp.props.coupon;

import base.FarmObj;
import base.Item;
import plant.Cabbage;
import utils.Enum.PlantType;

public abstract class Coupon extends Item implements Cloneable {
    protected PlantType plantType;

    public PlantType getPlantType() {
        return plantType;
    }

    public void setPlantType(PlantType plantType) {
        this.plantType = plantType;
    }

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
    //protected int price;

    //public int getPrice() {
    //    return price;
    //}

    //public void setPrice(int price) {
    //    this.price = price;
    //}

    //public void use(){
    //}