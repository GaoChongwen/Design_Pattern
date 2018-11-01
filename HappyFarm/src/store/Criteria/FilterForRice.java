package store.Criteria;

import base.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class FilterForRice implements Criteria {
    @Override
    public List<Plant> meetCriteria(List<Plant> Items) {
        List<Plant> resultItems = new ArrayList<Plant>();
        for (Plant item: Items
        ) {
            if(item.getName().equals("rice")){
                resultItems.add(item);
            }
        }
        return resultItems;
    }
}
