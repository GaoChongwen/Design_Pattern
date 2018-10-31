package plant;

import base.plant.Plant;
import factory.PlantFactory;
import utils.Context;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

/**
 * Design-Pattern: State, Prototype
 * @description: 小麦类，继承植物类
 * @author lipeng liang
 * @version 2018/10/28
 */

public class Wheat extends Plant {

    public Wheat() {
        super();
        this.type = PlantType.wheat;
        this.stockPrice = Context.wheat_stockPrice;
        this.salePrice = Context.wheat_salePrice;
        this.reqLandType = FarmLandType.cornField;
        PlantFactory.getInstance().putPlant(this);
        if(designPattern== DesignPatternMode.PrototypePattern){
            System.out.println("Prototype Pattern | Wheat: method Apple() -> Wheat initial once");
        }

    }

}
