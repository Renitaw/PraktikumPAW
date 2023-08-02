package com.helloworld.helloworld;

import java.sql.Date;

public class ExpressionStatement {
    public static void main(String[] args) {
        int value;
        value = 10;

        System.out.println(value = 100);

        // assigments statement
        double aValue = 8933.234;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Hello World!");
        // object creation statement
        Date date = new Date(value);
    }
    
}
