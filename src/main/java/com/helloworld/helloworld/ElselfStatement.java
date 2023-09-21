package com.helloworld.helloworld;

public class ElselfStatement {
    public static void main(String[] args) {
        // Mendefinisikan variabel 'nilai' dengan nilai 80, mewakili nilai akhir siswa.
        var nilai = 80;
        // Mendefinisikan variabel 'absen' dengan nilai 90, mewakili presentase kehadiran siswa.
        var absen = 90;
        
         // Memulai blok pernyataan if-else untuk mengevaluasi kategori nilai siswa.
        if (nilai >= 80 && absen >= 80) {
              // Jika nilai akhir dan presentase absen mencukupi, cetak pesan "Nilai Anda A".
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
              // Jika tidak memenuhi kondisi sebelumnya, tetapi nilai dan absen cukup, cetak pesan "Nilai Anda B".
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 60) {
            // Jika tidak memenuhi kondisi sebelumnya, tetapi nilai dan absen cukup, cetak pesan "Nilai Anda C".
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 50) {
             // Jika tidak memenuhi kondisi sebelumnya, tetapi nilai dan absen cukup, cetak pesan "Nilai Anda D".
            System.out.println("Nilai Anda D");
        } else {
            // Jika tidak memenuhi kondisi di atas, cetak pesan "Nilai Anda E".
            System.out.println("Nilai Anda E");
        }
    }
}
