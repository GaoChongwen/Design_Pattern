package test.factoryMethod;

import building.farmland.*;
import factory.FarmLandFactory;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;

/**
 * @project: HappyFarm
 * @scene: 土地工厂测试；现在创建一些新型土地，将这些土地挂载到土地工厂后，之后的土地均可从土地工厂中生产获取。
 *         注：实际上，所有土地可以先读配置表挂载于土地工厂中，之后可直接从工厂获取；
 * @designPattern: FactoryMethod
 * @author: Lipeng Liang
 * @date: 2018-10-31
 **/

public class FactoryPatternDemo2 {
    public static void main(String args[]) {

        // 测试
        System.out.println("==========FactoryPatternDemo1========");
        System.out.println("Scene: Now we create some FarmLands, like AppleField, cornField, RiceField, VegtbField, which will put itself into the FarmLandFactory."+
                "\nThen we will create those FarmLands from the Factory.");
        System.out.println("=====================================\n");

        // 设置DesignPatternMode,输出该模式相关信息
        FarmLandFactory.setDesignPattern(DesignPatternMode.FactoryPattern);

        System.out.println("1. Now we create somee FarmLands, like AppleField, CornField, RiceField, VegtbField.\n");

        // 创建土地：苹果林，麦田，稻田，菜地
        new AppleField();
        new VegtbField();
        new CornField();
        new RiceField();

        System.out.println("=====\n");
        System.out.println("2. Now we can see what Plant in PlantFactory\n");

        // 查看工厂中的所有土地
        FarmLandFactory.getInstance().getAllFarmLand();

        System.out.println("=====\n");
        System.out.println("3. Now we use FarmLandFactory to create those FarmLands\n");

        // 从工厂中创建土地
        AppleField a = (AppleField)FarmLandFactory.getInstance().createFarmLand(FarmLandType.appleField.toString());
        VegtbField c = (VegtbField) FarmLandFactory.getInstance().createFarmLand(FarmLandType.vegtbField.toString());
        CornField w = (CornField) FarmLandFactory.getInstance().createFarmLand(FarmLandType.cornField.toString());
        RiceField r = (RiceField) FarmLandFactory.getInstance().createFarmLand(FarmLandType.riceField.toString());

        System.out.println("=====\n");
        System.out.println("Test Done.");

    }
}
