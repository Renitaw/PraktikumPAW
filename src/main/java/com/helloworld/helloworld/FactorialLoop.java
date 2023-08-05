package com.helloworld.helloworld;

public class FactorialLoop {
    public static void main(String[] args) {
        int result = factorial(7);
        System.out.println("Factorial: " + result);
    }
        static int factorial(int value) {
            var result = 1;
            for (int i = 1; i <= value; i++){
                result *= i;
            }
            return result;
        }
    }
