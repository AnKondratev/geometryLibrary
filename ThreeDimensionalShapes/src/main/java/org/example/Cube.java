package org.example;

public record Cube(double sideLength) implements ThreeDimensionalFigure {
    public Cube {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина ребра должна быть положительным числом");
        }
    }

    @Override
    public double area() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public double volume() {
        return Math.pow(sideLength, 3);
    }
}


