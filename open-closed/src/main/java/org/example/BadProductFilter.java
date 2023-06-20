package org.example;

import java.util.List;
import java.util.stream.Stream;

public class BadProductFilter {
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.color().equals(color));
    }

    // against Open-Closed: now we are modifying the class to add another filter
    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.size().equals(size));
    }

    // this would go on for every added filter criteria!
}
