package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.RED, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        BadProductFilter badProductFilter = new BadProductFilter();
        System.out.println("Green products (bad filter):");
        badProductFilter.filterByColor(products, Color.GREEN)
                .forEach(p -> System.out.println(" - " + p.name()));
    }
}