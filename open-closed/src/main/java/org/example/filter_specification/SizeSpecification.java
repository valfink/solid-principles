package org.example.filter_specification;

import lombok.AllArgsConstructor;
import org.example.Product;
import org.example.Size;

@AllArgsConstructor
public class SizeSpecification implements Specification<Product> {
    private Size size;

    @Override
    public boolean isSatisfied(Product item) {
        return item.size().equals(size);
    }
}
