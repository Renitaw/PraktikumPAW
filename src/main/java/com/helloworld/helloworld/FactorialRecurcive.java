package com.helloworld.helloworld;

public class FactorialRecurcive {
    public static void main(String[] args) {
        // Memanggil method factorialRecursive() dengan argumen 7 dan menyimpan hasilnya di variabel 'result'.
        int result = factorialRecursive(7);
        // Mencetak hasil faktorial ke layar.
        System.out.println("Factorial: " + result);
    }

    // Mendefinisikan method factorialRecursive() untuk menghitung faktorial secara rekursif
    static int factorialRecursive(int value) {
        // Base case: Jika nilai 'value' adalah 1, mengembalikan 1.
        if (value == 1) {
            return 1;
        } else {
            // Jika nilai 'value' lebih dari 1, mengembalikan hasil perkalian 'value' dengan faktorialRecursive(value - 1)
            return value * factorialRecursive(value - 1);
        }
    }
}
