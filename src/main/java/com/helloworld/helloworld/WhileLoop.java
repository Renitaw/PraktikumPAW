package com.helloworld.helloworld;

public class WhileLoop {
    public static void main(String[] args){
        // Mendefinisikan variabel 'counter' dengan nilai awal 1.
        var counter = 1;
        
        // Memulai perulangan menggunakan pernyataan while dengan kondisi 'counter' kurang dari atau sama dengan 10.
        while (counter <= 10){
            // Mencetak pesan yang menunjukkan nomor perulangan saat ini.
            System.out.println("Perulangan ke-" + counter);

            // Meningkatkan nilai 'counter' untuk iterasi berikutnya.
            counter++;
        }

    }
}
    

