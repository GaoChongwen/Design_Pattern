package piewerTest.Filter;

import base.plant.Plant;
import factory.PlantFactory;
import singleton.Farm;
import store.Criteria.Criteria;
import store.Criteria.CriteriaDemo;
import store.Criteria.FilterForRice;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String args[]){
        Farm.getInstance().initialFarmObj();
        List<Plant> plants = new ArrayList<Plant>();

        plants.add(PlantFactory.getInstance().createPlant("wheat"));
        plants.add(PlantFactory.getInstance().createPlant("apple"));
        plants.add(PlantFactory.getInstance().createPlant("rice"));
        plants.add(PlantFactory.getInstance().createPlant("cabbage"));


        Criteria ricePlant = new FilterForRice();


        System.out.println("Rices: ");
        printPlants(ricePlant.meetCriteria(plants));

    }

    public static void printPlants(List<base.plant.Plant> plants){
        for (Plant plant : plants) {
            System.out.println("Plant : [ Name : " + plant.getName());
        }
    }
}
