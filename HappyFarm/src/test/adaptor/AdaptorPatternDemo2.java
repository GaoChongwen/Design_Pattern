package test.adaptor;

import building.farmland.AppleField;
import building.farmland.CornField;
import building.farmland.RiceField;
import factory.AdaptorFactory;
import factory.FarmLandFactory;
import factory.PlantFactory;
import plant.Apple;
import plant.Rice;
import plant.Wheat;
import propComp.props.landAdaptor.AllAdaptor;
import singleton.Farm;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

/**
 * @project: HappyFarm
 * @scene: 土地为RiceField类, 只可种植水稻(Rice), 无法种植苹果(Apple),
 * 使用AllAdaptor, 使其可种植任意类型植物，使用一次后失效。
 * @designPattern: Adaptor
 * @author: Lipeng Liang
 * @date: 2018-10-27
 **/

public class AdaptorPatternDemo2 {

    public static void main(String args[]) {

        // 读配置表，配置植物、土地、副产品、适配器(使用适配器必须先配置)等
        Farm.getInstance().initialFarmObj();
        // 创建万能适配器
        AllAdaptor allAdaptor1 = (AllAdaptor) AdaptorFactory.getInstance().createAdaptor(FarmLandType.allField.toString());
        AllAdaptor allAdaptor2 = (AllAdaptor) AdaptorFactory.getInstance().createAdaptor(FarmLandType.allField.toString());

        // 创建水稻田
        RiceField riceField1 = (RiceField) FarmLandFactory.getInstance().createFarmLand(FarmLandType.riceField.toString());
        RiceField riceField2 = (RiceField) FarmLandFactory.getInstance().createFarmLand(FarmLandType.riceField.toString());

        // 创建苹果和水稻
        Apple a = (Apple) PlantFactory.getInstance().createPlant(PlantType.apple.toString());
        Rice r = (Rice) PlantFactory.getInstance().createPlant(PlantType.rice.toString());

        // 测试
        System.out.println("==========AdaptorPatternDemo2========");
        System.out.println("Scene: FarmLand is a RiceField, which can plant Rice only, so it can't plant Apple),\n"+
                "Now We use AllAdaptor, which makes RiceField able to plant any type of Plant (also can plant Rice). It will be invalid after using once.");
        System.out.println("=====================================");

        // 设置DesignPatternMode,输出该模式相关信息
        allAdaptor1.setDesignPattern(DesignPatternMode.AdaptorPattern);
        allAdaptor2.setDesignPattern(DesignPatternMode.AdaptorPattern);
        riceField1.setDesignPattern(DesignPatternMode.AdaptorPattern);
        riceField2.setDesignPattern(DesignPatternMode.AdaptorPattern);

        System.out.println("1. Now we try to plant Apple on RiceField.\n");

        // 水稻田种植苹果，失败
        riceField1.plant(a);

        System.out.println("=====\n");
        System.out.println("2. Now we use AllAdaptor on RiceField1 and try to plant Apple on RiceField1.\n" +
                "AllAdaptor will use AppleField to plant the apple.\n");

        // 水稻田使用万能适配器，种植苹果，则使用万能适配器种植苹果，成功
        riceField1.use(allAdaptor1);
        riceField1.plant(a);

        System.out.println("=====\n");
        System.out.println("3. Now we use AllAdaptor on RiceField2 and try to plant Rice on RiceField2.\n" +
                "AppleFiled2 will use itself to plant the Apple.\n");

        // 水稻田使用万能适配器，种植水稻，仍旧使用自己的方法种植水稻，成功
        riceField2.use(allAdaptor2);
        riceField2.plant(r);

        System.out.println("=====\n");
        System.out.println("Test Done.");

    }
}
