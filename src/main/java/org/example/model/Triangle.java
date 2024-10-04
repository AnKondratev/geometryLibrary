package org.example.model;

import org.example.GeometricFigure;

public class Triangle implements GeometricFigure {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("The sides of the triangle must be positive");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("The sides cannot form a triangle");
        }
    }

    @Override
    public double area() {
        double semiP = semiPerimeter(sideA, sideB, sideC);
        return Math.sqrt(semiP * (semiP - sideA) * (semiP - sideB) * (semiP - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    private double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }
}
