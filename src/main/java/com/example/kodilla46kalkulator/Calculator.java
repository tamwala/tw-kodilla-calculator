package com.example.kodilla46kalkulator;

public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }


    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.addition(2,5);
        System.out.println(calculator.addition(2,5));

    }
}
