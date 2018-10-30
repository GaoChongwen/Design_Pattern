package store.Criteria;

import base.Item;
import base.plant.Plant;

import java.util.List;

public interface Criteria{
   public List<Plant> meetCriteria(List<Plant> persons);
}