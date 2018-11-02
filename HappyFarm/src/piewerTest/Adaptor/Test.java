package piewerTest.Adaptor;

import building.farmland.AppleField;
import factory.AdaptorFactory;
import factory.FarmLandFactory;
import factory.PlantFactory;
import plant.Apple;
import plant.Cabbage;
import propComp.props.landAdaptor.VegtbAdaptor;
import singleton.Farm;
import utils.Enum.DesignPatternMode;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

public class Test {
    public static void main(String args[]) {

        Farm.getInstance().initialFarmObj();

        System.out.println("适配器模式");
        // 适配器
        VegtbAdaptor VegtbAdaptor1 = (VegtbAdaptor) AdaptorFactory.getInstance().createAdaptor(FarmLandType.vegtbField.toString());
        VegtbAdaptor VegtbAdaptor2 = (VegtbAdaptor) AdaptorFactory.getInstance().createAdaptor(FarmLandType.vegtbField.toString());

        // 苹果地
        AppleField appleField1 = (AppleField) FarmLandFactory.getInstance().createFarmLand(FarmLandType.appleField.toString());
        AppleField appleField2 = (AppleField) FarmLandFactory.getInstance().createFarmLand(FarmLandType.appleField.toString());

        // 白菜和苹果
        Cabbage c = (Cabbage) PlantFactory.getInstance().createPlant(PlantType.cabbage.toString());
        Apple a = (Apple)PlantFactory.getInstance().createPlant(PlantType.apple.toString());

        // 设置设计模式
        VegtbAdaptor1.setDesignPattern(DesignPatternMode.AdaptorPattern);
        VegtbAdaptor2.setDesignPattern(DesignPatternMode.AdaptorPattern);
        appleField1.setDesignPattern(DesignPatternMode.AdaptorPattern);
        appleField2.setDesignPattern(DesignPatternMode.AdaptorPattern);

        System.out.println("=====苹果地1种植白菜\n");
        appleField1.plant(c);

        System.out.println("=====苹果地1+适配器种植白菜\n");
        // 苹果地->适配器->种白菜
        appleField1.use(VegtbAdaptor1);
        appleField1.plant(c);

        System.out.println("=====苹果地2种植苹果\n");

        // 苹果地->苹果
        appleField2.use(VegtbAdaptor2);
        appleField2.plant(a);

        System.out.println("=====苹果地1种植苹果\n");

        // 苹果地->苹果
        appleField1.plant(a);

        System.out.println("=====\n");
    }
}
