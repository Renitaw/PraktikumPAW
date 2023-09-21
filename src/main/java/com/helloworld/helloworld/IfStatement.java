package com.helloworld.helloworld;

public class IfStatement {
    public static void main(String[] args) {
         // Mendefinisikan variabel 'nilai' dengan nilai 70, mewakili nilai akhir siswa.
        var nilai = 70;
        // Mendefinisikan variabel 'absen' dengan nilai 90, mewakili presentase kehadiran siswa.
        var absen = 90;
    
        // Memulai blok pernyataan if untuk mengevaluasi kondisi kelulusan.
        if (nilai >= 75 && absen >= 75) {
            // Jika nilai akhir dan presentase absen mencukupi, maka cetak pesan lulus.
            System.out.println("Anda Lulus");
        }
        else{
            // Jika salah satu atau kedua kondisi tidak terpenuhi, cetak pesan tidak lulus.
            System.out.println("Anda Tidak Lulus");
        }
    }
}
