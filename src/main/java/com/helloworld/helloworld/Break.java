package com.helloworld.helloworld;

public class Break {
    public static void main(String[] args){
        // Mendefinisikan variabel 'counter' dengan nilai awal 1.
        var counter = 1;

        // Memulai perulangan tanpa batas menggunakan pernyataan while.
        while (true) {
             // Mencetak pesan yang menunjukkan nomor perulangan saat ini.
            System.out.println("Perulangan ke-" + counter);
            // Meningkatkan nilai 'counter' untuk iterasi berikutnya.
            counter++;


            // Memeriksa apakah nilai 'counter' lebih dari 10.
            // Jika ya, perulangan akan dihentikan menggunakan pernyataan break.
            if (counter > 10) {
                break;
            }
        }
    }
}
