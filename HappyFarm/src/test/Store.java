package test;


import animal.Cow;
import base.plant.Plant;
import building.shed.CowShed;
import factory.PlantFactory;
import person.Employee;
import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import propComp.PropDir.Prop;
import singleton.Farm;
import singleton.Repository;
import utils.Enum.PlantType;

import java.util.ArrayList;
import java.util.List;

/**
 * 商店测试
 */
public class Store {
    public static void main(String args[]){
        Farm.getInstance().initialFarmObj();
        Prop prop = new Prop();
        /**
         * 商店展示，暂只支持买卖animal,plant，购买adaptor,employee,出售produce
         */
        store.Store.getInstance().show();
        /**
         * 测试购买
         */

        store.Store.getInstance().buyCommity("wheat",2);
        System.out.println("Does the warehouse contain wheat?，true or false ");
        System.out.println(Repository.getInstance().getPlantNum("wheat"));

        store.Store.getInstance().buyCommity("cow",2);
        System.out.println("Does the cowshed contain cow?，true or false ");
        System.out.println(!CowShed.getInstance().isEmpty());

        store.Store.getInstance().buyCommity("appleField",2);
        System.out.println("Does user have appleField?");
        Farm.getInstance().showAdaptorInPropBag();

        store.Store.getInstance().buyCommity("sickle",2);
        Farm.getInstance().showToolInBag();

        store.Store.getInstance().buyCombo(2);

 }
}
