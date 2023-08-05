package com.helloworld.helloworld;

public class FactorialRecurcive {
    public static void main(String[] args) {
        int result = factorialRecursive(7);
        System.out.println("Factorial: " + result);
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
}
