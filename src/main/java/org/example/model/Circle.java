package org.example.model;

import org.example.GeometricFigure;

import java.lang.Math;

import static java.lang.Math.PI;

public class Circle implements GeometricFigure {

    private final double radius;
    private final double pi = PI;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }
}
