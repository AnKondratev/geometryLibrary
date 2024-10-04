package org.example;

public record Cylinder(double radius, double height) implements ThreeDimensionalFigure {

    @Override
    public double area() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

