package org.example.filter_specification;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
