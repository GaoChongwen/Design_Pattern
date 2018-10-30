package test.adaptor;

import building.farmland.AppleField;
import building.farmland.CornField;
import building.farmland.RiceField;
import plant.Apple;
import plant.Wheat;
import propComp.props.landAdaptor.AllAdaptor;
import propComp.props.landAdaptor.RiceAdaptor;

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
        // 创建万能适配器
        AllAdaptor allAdaptor = new AllAdaptor();
        // 创建水稻田
        RiceField riceField = new RiceField();

        // 水稻田种植苹果，失败
        Apple a = new Apple();
        riceField.plant(a);

        // 水稻田使用万能适配器，种植苹果，成功
        riceField.use(allAdaptor);
        riceField.plant(a);
    }
}
