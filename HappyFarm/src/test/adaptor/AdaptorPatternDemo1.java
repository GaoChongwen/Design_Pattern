package test.adaptor;

import base.FarmObj;
import building.farmland.AppleField;
import factory.AdaptorFactory;
import factory.FarmLandFactory;
import factory.PlantFactory;
import plant.Wheat;
import propComp.props.landAdaptor.CornAdaptor;
import singleton.Farm;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;

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
        CornAdaptor cornAdaptor = (CornAdaptor) AdaptorFactory.getInstance().createAdaptor(FarmLandType.cornField.toString());

        // 创建苹果地
        AppleField appleField = (AppleField) FarmLandFactory.getInstance().createFarmLand(FarmLandType.appleField.toString());

        System.out.println("==========AdaptorPatternDemo1========");
        System.out.println("Scene:土地为AppleField类, 只可种植苹果(Apple), 无法种植小麦(Wheat),\n" +
                "使用CornAdaptor适配器, 使其除了种植苹果外，还可种植小麦，使用一次后失效；");
        System.out.println("=====================================");

        // 设置DesignPatternMode,输出该模式相关信息
        cornAdaptor.setDesignPattern(DesignPatternMode.AdaptorPattern);
        appleField.setDesignPattern(DesignPatternMode.AdaptorPattern);
        // 使用苹果地种植小麦,失败
        Wheat w = (Wheat) PlantFactory.getInstance().createPlant("wheat");
        appleField.plant(w);

        // 苹果地使用小麦适配器，种植小麦，成功
        appleField.use(cornAdaptor);
        appleField.plant(w);
    }
}
