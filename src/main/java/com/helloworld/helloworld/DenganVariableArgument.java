package com.helloworld.helloworld;

public class DenganVariableArgument {
    public static void main(String[] args){
        sayCongrats("Renita", 80, 90, 79, 48);
    }

    static void sayCongrats(String name, int... values){
        int total = 0;
        for (int value : values){
            total += value;
        }
        int finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
