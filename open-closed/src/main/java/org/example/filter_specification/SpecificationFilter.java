package org.example.filter_specification;

import org.example.Product;

import java.util.List;
import java.util.stream.Stream;

public class SpecificationFilter implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specification) {
        return items.stream().filter(specification::isSatisfied);
    }
}
