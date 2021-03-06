package test.singleton;

import produce.AnimalFood;
import produce.CookedFood;
import propComp.PropDir.Prop;
import propComp.PropDir.PropDir;
import propComp.PropDir.Root;
import propComp.props.landAdaptor.AppleAdaptor;
import propComp.props.landAdaptor.CornAdaptor;

/**
 * @project: HappyFarm
 * @scene: 工具箱 用于存储Produce以及Adaptor
 * @designPattern: Singleton
 * @author: Jihao Luo
 * @date: 2018-10-30
 **/
public class SingletonDemo3 {
    public static void main(String[] args) {
        System.out.println("==========Singleton Demo========");
        System.out.println("Scene: After buying certain items in the store, we need to store them.");
        System.out.println("===================================================");
        System.out.println("=============We first add some instance ===========");
        System.out.println("Singleton:Root:root:Instance Get");
        Prop prop = new Prop();
        try {
            prop.createTree();//Initial !!!!!!
        } catch (Exception e) {
            e.printStackTrace();
        }
        AppleAdaptor adaptor = new AppleAdaptor();
        CornAdaptor cornAdaptor = new CornAdaptor();
        System.out.println("=============Then we demonstrate it===============");
        //System.out.println(adaptor.getName());
        //System.out.println(Root.getInstance().propDir.nodeList.size());
        prop.addAdaptor(adaptor);
        prop.addAdaptor(cornAdaptor);
        prop.display((PropDir) Root.getInstance().propDir);
        System.out.println("=====Add some more and demonstrate it again=======");
        AnimalFood animalFood = new AnimalFood();
        CookedFood cookedFood = new CookedFood();
        prop.addProduct(animalFood);
        prop.addProduct(cookedFood);
        prop.display((PropDir) Root.getInstance().propDir);



    }
}
