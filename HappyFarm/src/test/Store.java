package test;


import base.plant.Plant;
import building.shed.CowShed;
import factory.PlantFactory;
import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import singleton.Farm;
import singleton.Repository;
import utils.Enum.PlantType;

public class Store {
    public static void main(String args[]){
        Farm.initialFarmObj();
        new Apple();
        new Wheat();
        new Cabbage();
        new Rice();
        /**
         * 测试购买，暂只支持购买animal和plant
         */
        store.Store.getInstance().buyCommity("wheat",2);
        System.out.println("仓库中是否含有wheat，1为是，0为否: ");
        System.out.println(Repository.getInstance().contains(new Wheat()));
        store.Store.getInstance().buyCommity("cow",2);
        System.out.println();

 }
}
