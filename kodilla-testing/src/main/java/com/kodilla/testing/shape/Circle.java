package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double a;

    public Circle(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return a*a*Math.PI;
    }

    @Override
    public String toString() {
        return getShapeName() + ", " + getField();
    }
}
