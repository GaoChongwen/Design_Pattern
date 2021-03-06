package test.filter;

import base.plant.Plant;
import factory.PlantFactory;
import plant.Wheat;
import singleton.Farm;
import store.Criteria.Criteria;
import store.Criteria.CriteriaDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wenyuan Li
 * @version 2018-10-31
 * Scenario: Filter out specific plants
 */
public class CriteriaTest {
    public static void main(String args[]){
        Farm.getInstance().initialFarmObj();
        List<base.plant.Plant> plants = new ArrayList<base.plant.Plant>();

        plants.add(PlantFactory.getInstance().createPlant("wheat"));
        plants.add(PlantFactory.getInstance().createPlant("apple"));
        plants.add(PlantFactory.getInstance().createPlant("rice"));
        plants.add(PlantFactory.getInstance().createPlant("cabbage"));


        Criteria applePlant = new CriteriaDemo();


        System.out.println("Apples: ");
        printPlants(applePlant.meetCriteria(plants));

    }

    public static void printPlants(List<base.plant.Plant> plants){
        for (Plant plant : plants) {
            System.out.println("Plant : [ Name : " + plant.getName());
        }
    }
}
