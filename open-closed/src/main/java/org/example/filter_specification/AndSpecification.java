package org.example.filter_specification;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AndSpecification<T> implements Specification<T> {
    private Specification<T> first, second;

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
