package com.kodilla.testing;

import com.kodilla.testing.Calculator.Calculator;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;


public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int addResult = calculator.add(3, 5);

        if (addResult == 8) {
            System.out.println("Code correct!");
        } else {
            System.out.println("Error!");
        }

        int substractResult = calculator.substract(5, 1);

        if (substractResult == 4) {
            System.out.println("Code correct!");
        } else {
            System.out.println("Error!");
        }

    }
}