package org.example;

public class Main {

    static void useRectangle(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);
        System.out.println("Expecting area of " + (width*10) + ", getting " + rectangle.getArea());
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        useRectangle(rectangle);

        // Square breaks the math!
        Square square = new Square(5);
        useRectangle(square);
    }
}