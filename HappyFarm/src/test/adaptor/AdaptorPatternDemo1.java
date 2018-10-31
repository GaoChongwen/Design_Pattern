package test.adaptor;

import building.farmland.AppleField;
import factory.AdaptorFactory;
import factory.FarmLandFactory;
import factory.PlantFactory;
import plant.Apple;
import plant.Wheat;
import propComp.props.landAdaptor.CornAdaptor;
import singleton.Farm;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

/**
 * @project: HappyFarm
 * @scene: 土地为AppleField类, 只可种植苹果(Apple), 无法种植小麦(Wheat),
 * 使用CornAdaptor, 使其除了种植苹果外，还可种植小麦，使用一次后失效；
 * @designPattern: Adaptor
 * @author: Lipeng Liang
 * @date: 2018-10-27
 **/

public class AdaptorPatternDemo1 {

    public static void main(String args[]) {

        // 读配置表，配置植物、土地、适配器(使用适配器必须先配置)
        Farm.getInstance().initialFarmObj();

        // 创建小麦适配器
        CornAdaptor cornAdaptor1 = (CornAdaptor) AdaptorFactory.getInstance().createAdaptor(FarmLandType.cornField.toString());
        CornAdaptor cornAdaptor2 = (CornAdaptor) AdaptorFactory.getInstance().createAdaptor(FarmLandType.cornField.toString());

        // 创建苹果地
        AppleField appleField1 = (AppleField) FarmLandFactory.getInstance().createFarmLand(FarmLandType.appleField.toString());
        AppleField appleField2 = (AppleField) FarmLandFactory.getInstance().createFarmLand(FarmLandType.appleField.toString());


        // 创建小麦与苹果
        Wheat w = (Wheat) PlantFactory.getInstance().createPlant("wheat");
        Apple a = (Apple)PlantFactory.getInstance().createPlant(PlantType.apple.toString());

        // 测试
        System.out.println("==========AdaptorPatternDemo1========");
        System.out.println("Scene: FarmLand is an AppleField, which can plant Apple only, so it can't plant Wheat),\n"+
                "Now We use CornAdaptor, which makes AppleField able to plant Wheat (also can plant Apple). It will be invalid after using once.");
        System.out.println("=====================================\n");

        // 设置DesignPatternMode,输出该模式相关信息
        cornAdaptor1.setDesignPattern(DesignPatternMode.AdaptorPattern);
        cornAdaptor2.setDesignPattern(DesignPatternMode.AdaptorPattern);
        appleField1.setDesignPattern(DesignPatternMode.AdaptorPattern);
        appleField2.setDesignPattern(DesignPatternMode.AdaptorPattern);

        System.out.println("1. Now we try to plant Wheat on AppleField.\n");

        // 使用苹果地种植小麦,失败
        appleField1.plant(w);

        System.out.println("=====\n");
        System.out.println("2. Now we use cornAdaptor on AppleField1 and try to plant Wheat on AppleField1.\n"+
                "CornAdaptor will use WheatField to plant the wheat.\n");

        // 苹果地使用小麦适配器，种植小麦，则使用小麦适配器种植小麦，成功
        appleField1.use(cornAdaptor1);
        appleField1.plant(w);

        System.out.println("=====\n");
        System.out.println("3. Now we use cornAdaptor on AppleField2 and try to plant Apple on AppleField2.\n"+
                "AppleFiled2 will use itself to plant the wheat.\n");

        // 苹果地使用小麦适配器，种植苹果，仍旧使用自己的方法种植苹果，成功
        appleField2.use(cornAdaptor2);
        appleField2.plant(a);

        System.out.println("=====\n");
        System.out.println("Test Done.");
    }
}
