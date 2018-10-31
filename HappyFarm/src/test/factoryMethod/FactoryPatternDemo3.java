package test.factoryMethod;

import building.farmland.AppleField;
import building.farmland.CornField;
import building.farmland.RiceField;
import building.farmland.VegtbField;
import factory.AdaptorFactory;
import propComp.props.landAdaptor.*;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;

/**
 * @project: HappyFarm
 * @scene: 适配器工厂测试；现在创建一些新型适配器，将这些适配器挂载到适配器工厂后，之后的适配器均可从适配器工厂中生产获取。
 *         注：实际上，所有适配器可以先读配置表挂载于适配器工厂中，之后可直接从工厂获取；
 *            实际上，适配器中所转的土地需要先初始化；
 * @designPattern: FactoryMethod
 * @author: Lipeng Liang
 * @date: 2018-10-31
 **/

public class FactoryPatternDemo3 {
    public static void main(String args[]) {

        // 初始化适配器需要的土地
        new AppleField();
        new VegtbField();
        new CornField();
        new RiceField();

        // 测试
        System.out.println("==========FactoryPatternDemo3========");
        System.out.println("Scene: Now we create some Adaptors, like AppleFieldAdaptor, cornFieldAdaptor, RiceFieldAdaptor, VegtbFieldAdaptor, which will put itself into the AdaptorFactory."+
                "\nThen we will create those Adaptors from the Factory.");
        System.out.println("=====================================\n");

        // 设置DesignPatternMode,输出该模式相关信息
        AdaptorFactory.setDesignPattern(DesignPatternMode.FactoryPattern);

        System.out.println("1. Now we create somee Adaptors, like AppleFieldAdaptor, CornFieldAdaptor, RiceFieldAdaptor, VegtbFieldAdaptor.\n");

        // 创建适配器：苹果林，麦田，稻田，菜地
        new AppleAdaptor();
        new VegtbAdaptor();
        new CornAdaptor();
        new RiceAdaptor();

        System.out.println("=====\n");
        System.out.println("2. Now we can see what Adaptor in AdaptorFactory\n");

        // 查看工厂中的所有适配器
        AdaptorFactory.getInstance().getAllAdaptor();

        System.out.println("=====\n");
        System.out.println("3. Now we use AdaptorFactory to create those Adaptors\n");

        // 从工厂中创建适配器
        AllAdaptor allAdaptor = (AllAdaptor)AdaptorFactory.getInstance().createAdaptor(FarmLandType.allField.toString());
        AppleAdaptor appleAdaptor = (AppleAdaptor)AdaptorFactory.getInstance().createAdaptor(FarmLandType.appleField.toString());
        VegtbAdaptor vegtbAdaptor = (VegtbAdaptor) AdaptorFactory.getInstance().createAdaptor(FarmLandType.vegtbField.toString());
        CornAdaptor cornAdaptor = (CornAdaptor) AdaptorFactory.getInstance().createAdaptor(FarmLandType.cornField.toString());
        RiceAdaptor riceAdaptor = (RiceAdaptor) AdaptorFactory.getInstance().createAdaptor(FarmLandType.riceField.toString());

        System.out.println("=====\n");
        System.out.println("Test Done.");

    }
}
