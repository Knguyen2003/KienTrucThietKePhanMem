package com.iuh.leaf;

import com.iuh.base.Shape;

public class Circle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color "+fillColor);
    }
}
