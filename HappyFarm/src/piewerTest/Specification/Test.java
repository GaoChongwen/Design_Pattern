package piewerTest.Specification;

import base.plant.Plant;
import factory.PlantFactory;
import singleton.Farm;
import store.Specification.SpecificationShow;

import java.util.ArrayList;

public class Test {
    public static void main(String args[]){
        Farm.getInstance().initialFarmObj();
        //首先初始化一批植物
        ArrayList<Plant> plantList = new ArrayList<Plant>();
        plantList.add(PlantFactory.getInstance().createPlant("wheat"));
        plantList.add(PlantFactory.getInstance().createPlant("apple"));
        plantList.add(PlantFactory.getInstance().createPlant("rice"));

        SpecificationShow.getInstance().useSpecification(plantList,30);
    }
}
