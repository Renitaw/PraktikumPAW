package com.helloworld.helloworld;

public class TanpaVariableArgument {
    static void main(String name, int[] values) {
        // Mendefinisikan variabel 'total' untuk menghitung total nilai dari array 'values'.
        int total = 0;
         // Menggunakan perulangan for-each untuk mengiterasi melalui setiap nilai dalam array 'values'.
        for (var value : values) {
            total += value;// Menambahkan nilai ke total.
        }

        // Menghitung nilai rata-rata dari total.
        int finalValue = total / values.length;

        // Memeriksa apakah nilai rata-rata finalValue mencukupi untuk lulus atau tidak.
        if (finalValue >= 75) {
            // Jika mencukupi, mencetak pesan selamat lulus ke layar.
            System.out.println("Selamat" + name + "Anda Lulus");
        } else {
            // Jika tidak mencukupi, mencetak pesan tidak lulus ke layar.
            System.out.println("Maaf" + name + ", Anda Tidak Lulus");
        }
    }
}
