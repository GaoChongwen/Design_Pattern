package propComp.props.landAdaptor;

import base.Item;
import base.plant.Plant;
import building.farmland.FarmLand;
import utils.Enum.FarmLandType;

/**
 * Design-Pattern: Adaptor, Prototype
 * @description: 土地适配器抽象类（一种道具），可使任何土地转换种植另一种植物，使用过后该道具失效
 * @author lipeng liang
 * @version 2018/10/29
 */

public abstract class LandAdaptor extends Item implements Cloneable {
    protected boolean isUsed;
    protected FarmLandType landType;
    protected FarmLand land;
    protected String DesignPattern;

    protected LandAdaptor() {
        this.isUsed = false;
        this.land = null;
        DesignPattern="";
    }

    @Override
    protected void use() {
    }

    public FarmLandType getLandType() {
        return landType;
    }

    @Override
    public String getName() {
        return landType + "Adaptor";
    }


    public boolean plant(Plant plant) {
        if(DesignPattern=="Adaptor Pattern"){
            System.out.println("- Adaptor Pattern | " + landType + " method: plant(Plant p)");
        }
        if (!isUsed) {
            System.out.println(landType + " adaptor running, changes to " + land.getLandType());
            isUsed = land.plant(plant);
            System.out.println(isUsed ? "adaptor worked done." : "adaptor worked fail.");
            return isUsed;
        }
        return false;
    }



    public LandAdaptor clone() {
        LandAdaptor clone = null;
        try {
            clone = (LandAdaptor) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
    public void setDesignPattern(String designPattern){
        DesignPattern=designPattern;
    }
}