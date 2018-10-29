package store.Criteria;

import base.Item;

import java.util.List;

public interface Criteria{
   public List<Item> meetCriteria(List<Item> persons);
}