package org.example.model;

import org.example.GeometricFigure;

public class Rectangle implements GeometricFigure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        if ((length < 1 || width < 1) && length == width) {
            throw new IllegalArgumentException("Incorrect data entered");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
