package store.Criteria;
import base.plant.Plant;
import store.Criteria.Criteria;
import utils.Enum.PlantType;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个过滤器，过滤植物某属性
 */
public class CriteriaDemo implements Criteria {
    @Override
    public List<Plant> meetCriteria(List<Plant> Items) {
        List<Plant> resultItems = new ArrayList<Plant>();
        for (Plant item: Items
             ) {
            if(item.getName().equals("apple")){
                resultItems.add(item);
            }
        }
        return resultItems;
    }
}
