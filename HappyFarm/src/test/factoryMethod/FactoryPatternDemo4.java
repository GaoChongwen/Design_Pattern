package test.factoryMethod;

import factory.ProduceFactory;
import produce.AnimalFood;
import produce.CookedFood;
import produce.Milk;
import utils.Enum.DesignPatternMode;
import utils.Enum.ProduceType;

/**
 * @project: HappyFarm
 * @scene: 加工副产品工厂测试；现在创建一些新型加工副产品，将这些加工副产品挂载到加工副产品工厂后，之后的加工副产品均可从加工副产品工厂中生产获取。
 *         注：实际上，所有加工副产品可以先读配置表挂载于加工副产品工厂中，之后可直接从工厂获取；
 * @designPattern: FactoryMethod
 * @author: Lipeng Liang
 * @date: 2018-10-31
 **/

public class FactoryPatternDemo4 {
    public static void main(String args[]) {

        // 测试
        System.out.println("==========FactoryPatternDemo4========");
        System.out.println("Scene: Now we create some Produces, like AnimalFood, CookedFood, Milk, which will put itself into the ProduceFactory."+
                "\nThen we will create those Produces from the Factory.");
        System.out.println("=====================================\n");

        // 设置DesignPatternMode,输出该模式相关信息
        ProduceFactory.setDesignPattern(DesignPatternMode.FactoryPattern);

        System.out.println("1. Now we create some Produces, like AnimalFood, CookedFood, Milk.\n");

        // 创建加工副产品：苹果林，麦田，稻田，菜地
        new AnimalFood();
        new CookedFood();
        new Milk();

        System.out.println("=====\n");
        System.out.println("2. Now we can see what Produce in ProduceFactory\n");

        // 查看工厂中的所有加工副产品
        ProduceFactory.getInstance().getAllProduce();

        System.out.println("=====\n");
        System.out.println("3. Now we use ProduceFactory to create those Produces\n");

        // 从工厂中创建加工副产品
        AnimalFood a = (AnimalFood)ProduceFactory.getInstance().createProduce(ProduceType.animalFood.toString());
        CookedFood w = (CookedFood) ProduceFactory.getInstance().createProduce(ProduceType.cookedFood.toString());
        Milk r = (Milk) ProduceFactory.getInstance().createProduce(ProduceType.milk.toString());

        System.out.println("=====\n");
        System.out.println("Test Done.");

    }
}
