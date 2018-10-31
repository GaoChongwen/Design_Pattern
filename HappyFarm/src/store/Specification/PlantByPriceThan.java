package store.Specification;

import base.plant.Plant;

public class PlantByPriceThan extends CompositeSpecification{
    private Integer price;
    public PlantByPriceThan(Integer price) {
        this.price = price;
    }

    @Override
    public boolean isSatisfiedBy(Plant item) {
        return item.getSalePrice() > price;
    }
}
