package store.Criteria;
import base.plant.Plant;
import store.Criteria.Criteria;
import utils.Enum.PlantType;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个过滤器，过滤植物某属性（目前未定义）
 */
public class CriteriaDemo implements Criteria {
    @Override
    public List<Plant> meetCriteria(List<Plant> Items) {
        // TODO Auto-generated method stub
        List<Plant> resultItems = new ArrayList<Plant>();
        for (Plant item: Items
             ) {
            if(item.checkType(PlantType.valueOf("apple"))){
                resultItems.add(item);
            }
        }
        return resultItems;
    }
}
