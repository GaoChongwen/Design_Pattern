package test.adaptor;

import building.farmland.AppleField;
import building.farmland.CornField;
import building.farmland.RiceField;
import factory.AdaptorFactory;
import factory.FarmLandFactory;
import plant.Apple;
import plant.Wheat;
import propComp.props.landAdaptor.AllAdaptor;
import propComp.props.landAdaptor.RiceAdaptor;
import singleton.Farm;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;

/**
 * @project: HappyFarm
 * @scene: 土地为RiceField类, 只可种植水稻(Rice), 无法种植苹果(Apple),
 *         使用AllAdaptor, 使其可种植任意类型植物，使用一次后失效。
 * @designPattern: Adaptor
 * @author: Lipeng Liang
 * @date: 2018-10-27
 **/

public class AdaptorPatternDemo2 {

    public static void main(String args[]) {

        // 读配置表，配置植物、土地、副产品、适配器(使用适配器必须先配置)等
        Farm.getInstance().initialFarmObj();
        // 创建万能适配器
        AllAdaptor allAdaptor = (AllAdaptor) AdaptorFactory.getInstance().createAdaptor(FarmLandType.allField.toString());
        // 创建水稻田
        RiceField riceField = (RiceField) FarmLandFactory.getInstance().createFarmLand(FarmLandType.riceField.toString());

        System.out.println("==========AdaptorPatternDemo2========");
        System.out.println("Scene:土地为RiceField类, 只可种植大米(Rice), 无法种植苹果(Apple),\n" +
                "使用AllAdaptor适配器, 使其可种植任意类型植物，使用一次后失效；");
        System.out.println("=====================================");
        // 设置DesignPatternMode,输出该模式相关信息
        allAdaptor.setDesignPattern(DesignPatternMode.AdaptorPattern);
        riceField.setDesignPattern(DesignPatternMode.AdaptorPattern);
        // 水稻田种植苹果，失败
        Apple a = new Apple();
        riceField.plant(a);

        // 水稻田使用万能适配器，种植苹果，成功
        riceField.use(allAdaptor);
        riceField.plant(a);
    }
}
