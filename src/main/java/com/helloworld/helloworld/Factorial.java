package com.helloworld.helloworld;

public class Factorial {
    static int factorial(int value) {
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    static int factorialRecurcive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecurcive(value - 1);
        }
    }

    public static void main(String[] args) {
        int number = 4, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);

        int datainput = 5, hasildata;
        hasildata = factorialRecurcive(datainput);
        System.out.println(datainput + " factorialRec. = " + hasildata);
    }

}
