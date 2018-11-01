package store.Criteria;

import base.plant.Plant;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Plant> meetCriteria(List<Plant> persons) {
        List<Plant> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Plant> otherCriteriaPersons = otherCriteria.meetCriteria(persons);
        for (Plant plant : otherCriteriaPersons) {
            if (!firstCriteriaPersons.contains(plant)) {
                firstCriteriaPersons.add(plant);
            }
        }
        return firstCriteriaPersons;
    }
    
}
