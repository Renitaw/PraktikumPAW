package com.helloworld.helloworld;

public class DenganVariableArgument {
    public static void main(String[] args){
         // Memanggil method sayCongrats() dengan argumen nama, nilai-nilai ujian.
        sayCongrats("Renita", 80, 90, 79, 48);
    }

    static void sayCongrats(String name, int... values){
        int total = 0;
        // Menggunakan perulangan for-each untuk mengiterasi melalui setiap nilai dalam variable argument 'values'.
        for (int value : values){
            total += value;  // Menambahkan nilai ke total.
        }
        // Menghitung nilai rata-rata dari total nilai.
        int finalValue = total / values.length;
        // Memeriksa apakah nilai rata-rata finalValue mencukupi untuk lulus atau tidak.
        if (finalValue >= 75) {
            // Jika mencukupi, mencetak pesan selamat lulus dengan nama siswa ke layar.
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            // Jika tidak mencukupi, mencetak pesan tidak lulus dengan nama siswa ke layar.
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
