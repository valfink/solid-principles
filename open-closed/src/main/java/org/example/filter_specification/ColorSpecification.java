package org.example.filter_specification;

import lombok.AllArgsConstructor;
import org.example.Color;
import org.example.Product;

@AllArgsConstructor
public class ColorSpecification implements Specification<Product> {
    private Color color;

    @Override
    public boolean isSatisfied(Product item) {
        return item.color().equals(color);
    }
}
