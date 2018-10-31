package plant;

import base.plant.Plant;
import factory.PlantFactory;
import utils.Context;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

/**
 * Design-Pattern: State, Prototype
 * @description: 水稻类，继承植物类
 * @author lipeng liang
 * @version 2018/10/28
 */

public class Rice extends Plant {

    public Rice() {
        super();
        this.type = PlantType.rice;
        this.stockPrice = Context.rice_stockPrice;
        this.salePrice = Context.rice_salePrice;
        this.reqLandType= FarmLandType.riceField;
        PlantFactory.getInstance().putPlant(this);
        if(designPattern== DesignPatternMode.PrototypePattern){
            System.out.println("Prototype Pattern | Rice: method Rice() -> Rice initial once");
        }
    }
}
