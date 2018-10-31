package store.Specification;

import base.plant.Plant;

public interface ISpecification
{
    boolean isSatisfiedBy(Plant candidate);
    ISpecification and(ISpecification spec);
    ISpecification or(ISpecification spec);
    ISpecification not();
}
