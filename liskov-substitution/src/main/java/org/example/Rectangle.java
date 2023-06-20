package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Rectangle {
    protected int width;
    protected int height;

    public int getArea() {
        return width * height;
    }
}
