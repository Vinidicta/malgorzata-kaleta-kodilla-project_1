package com.kodilla.testing.shape;

public class Triangle implements Shape {

    public double a;
    public double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return (a*b)/2;
    }

    @Override
    public String toString() {
        return getShapeName() + ", " + getField();
    }
}
