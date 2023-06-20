package org.example;

import org.example.filter_specification.AndSpecification;
import org.example.filter_specification.ColorSpecification;
import org.example.filter_specification.SizeSpecification;
import org.example.filter_specification.SpecificationFilter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.RED, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);


        // Bad way, code needed to be modified for different filter criteria

        BadProductFilter badProductFilter = new BadProductFilter();
        System.out.println("Green products (bad filter):");
        badProductFilter.filterByColor(products, Color.GREEN)
                .forEach(p -> System.out.println(" - " + p.name()));


        // Good way, with code open for extension and closed for modification

        SpecificationFilter specificationFilter = new SpecificationFilter();

        System.out.println("Green products (good filter):");
        specificationFilter.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name()));
        System.out.println("Large products (good filter):");
        specificationFilter.filter(products, new SizeSpecification(Size.LARGE))
                .forEach(p -> System.out.println(" - " + p.name()));
        System.out.println("Large red products (good filter):");
        specificationFilter.filter(products, new AndSpecification<>(
                new SizeSpecification(Size.LARGE), new ColorSpecification(Color.RED)
        ))
                .forEach(p -> System.out.println(" - " + p.name()));
    }
}