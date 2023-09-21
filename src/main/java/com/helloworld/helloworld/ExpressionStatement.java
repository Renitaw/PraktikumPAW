package com.helloworld.helloworld;

import java.sql.Date;

public class ExpressionStatement {
    public static void main(String[] args) {
        // Deklarasi variabel integer 'value'.
        int value;
        // Memberikan nilai 10 kepada variabel 'value'.
        value = 10;

         // Menetapkan nilai 100 kepada variabel 'value' dan mencetak nilai tersebut.
        System.out.println(value = 100);

        // Statement penugasan (assignments).
        double aValue = 8933.234;
         // Statement penambahan nilai (increment).
        aValue++;
        // Pemanggilan metode dan statement invokasi.
        System.out.println("Hello World!");
        // Statement pembuatan objek.
        Date date = new Date(value);
    }
    
}
