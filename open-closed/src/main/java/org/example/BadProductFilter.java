package org.example;

import java.util.List;
import java.util.stream.Stream;

public class BadProductFilter {
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.color().equals(color));
    }

}
