package store.Specification;

import base.Item;

public interface ISpecification
{
    boolean isSatisfiedBy(Item candidate);
    ISpecification and(ISpecification spec);
    ISpecification or(ISpecification spec);
    ISpecification not();
}
