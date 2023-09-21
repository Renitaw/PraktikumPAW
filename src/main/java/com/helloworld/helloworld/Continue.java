package com.helloworld.helloworld;

public class Continue {
    public static void main(String[] args) {
        // Memulai perulangan menggunakan pernyataan for dengan penghitung 'counter'.
        for (int counter = 1; counter <= 100; counter++){
             // Memeriksa apakah nilai 'counter' adalah bilangan genap.
            // Jika ya, lanjutkan ke iterasi berikutnya menggunakan pernyataan continue.
            if (counter % 2 == 0) {
                continue;
            }

             // Mencetak pesan yang menunjukkan nomor perulangan ganjil saat ini (nilai 'counter').
            System.out.println("Perulangan Ganjil-" + counter);
        }
    }
    
}
