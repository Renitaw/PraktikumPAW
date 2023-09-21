package com.helloworld.helloworld;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Mendefinisikan variabel 'counter' dengan nilai awal 100.
        var counter = 100;

        // Memulai perulangan do-while.
        do {
            // Mencetak pesan yang menunjukkan nomor perulangan saat ini.
            System.out.println("Perulangan ke-" + counter);
            // Meningkatkan nilai 'counter' untuk iterasi berikutnya.
            counter++;

            // Melakukan perulangan selama nilai 'counter' kurang dari atau sama dengan 10.
        } while (counter <=10);
    }
}
