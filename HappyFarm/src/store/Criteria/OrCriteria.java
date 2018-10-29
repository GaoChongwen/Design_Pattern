package store.Criteria;

import base.Item;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Item> meetCriteria(List<Item> persons) {
        // TODO Auto-generated method stub
        List<Item> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Item> otherCriteriaPersons = otherCriteria.meetCriteria(persons);
        for (Item Item : otherCriteriaPersons) {
            if (!firstCriteriaPersons.contains(Item)) {
                firstCriteriaPersons.add(Item);
            }
        }
        return firstCriteriaPersons;
    }
    
}
