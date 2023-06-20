package org.example;

public class Square extends Rectangle {
    public Square(int length) {
        width = height = length;
    }

    // BAD IDEA - against Liskov substitution - breaks usage of rectangle setters!
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
