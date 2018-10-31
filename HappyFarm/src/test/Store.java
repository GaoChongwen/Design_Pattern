package test;


import animal.Cow;
import base.plant.Plant;
import building.shed.CowShed;
import factory.PlantFactory;
import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import propComp.PropDir.Prop;
import singleton.Farm;
import singleton.Repository;
import utils.Enum.PlantType;

/**
 * 商店测试，目前植物可以完全支持，动物可能有问题，其他未添加
 */
public class Store {
    public static void main(String args[]){
        Farm.getInstance().initialFarmObj();
        new Apple();
        new Wheat();
        new Cabbage();
        new Rice();
        Prop prop = new Prop();
        /**
         * 测试购买，暂只支持购买animal和plant
         */

        store.Store.getInstance().buyCommity("wheat",2);
        System.out.println("Does the warehouse contain wheat?，true or false ");
        System.out.println(Repository.getInstance().getPlantNum("wheat"));
        store.Store.getInstance().buyCommity("cow",2);
        System.out.println("Does the warehouse contain cow?，true or false ");
        System.out.println(!CowShed.getInstance().isEmpty());
 }
}
