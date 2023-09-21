package com.helloworld.helloworld;

public class MethodReturnValue {
    public static void main(String[] args){
        // Mendefinisikan variabel 'a' dengan nilai 100.
        var a = 100;
        // Mendefinisikan variabel 'b' dengan nilai 200.
        var b = 200;
        // Memanggil method sum() dengan argumen 'a' dan 'b', dan menyimpan hasilnya di variabel 'c'.
        var c = sum(a, b);

        // Mencetak nilai 'c' yang merupakan hasil penjumlahan dari 'a' dan 'b'.
        System.out.println(c);
    }
    // Mendefinisikan method sum() yang mengambil dua parameter 'value1' dan 'value2'.
    static int sum(int value1, int value2) {
        // Menjumlahkan 'value1' dan 'value2', dan menyimpan hasilnya di variabel 'total'.
        var total = value1 + value2;
        // Mengembalikan nilai 'total' sebagai hasil dari method.
        return total;
    }
}
