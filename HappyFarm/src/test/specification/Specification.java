package test.specification;

import base.plant.Plant;
import factory.PlantFactory;
import singleton.Farm;
import store.Specification.ISpecification;
import store.Specification.PlantByPriceThan;

import java.util.ArrayList;

/**
 * @author Wenyuan Li
 * @version 2018-10-31
 * Scenario: Screen plants according to specific conditions
 */
public class Specification {
    public static void main(String args[]){
        Farm.getInstance().initialFarmObj();
        //首先初始化一批植物
        ArrayList<Plant> plantList = new ArrayList<Plant>();
        plantList.add(PlantFactory.getInstance().createPlant("wheat"));
        plantList.add(PlantFactory.getInstance().createPlant("apple"));
        plantList.add(PlantFactory.getInstance().createPlant("rice"));

        //打印出价格高于20的植物
        System.out.println("===The price of plant is higher than 20===");
        //定义一个规格
        ISpecification spec = new PlantByPriceThan(25);
        for(Plant u:plantList){
            if(spec.isSatisfiedBy(u))
                System.out.println(u);
        }
    }
}
