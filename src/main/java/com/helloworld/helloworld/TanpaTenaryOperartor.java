package com.helloworld.helloworld;

public class TanpaTenaryOperartor {
    public static void main(String[] args) {
        // Mendefinisikan variabel 'nilai' dengan nilai 75, mewakili nilai akhir siswa.
        var nilai = 75;
        // Mendefinisikan variabel 'ucapan' untuk menampung pesan ucapan berdasarkan kondisi nilai.
        String ucapan;

        // Memulai blok pernyataan if-else untuk mengevaluasi kondisi nilai siswa.
        if (nilai >= 75) {
            // Jika nilai akhir lebih besar atau sama dengan 75, maka berikan ucapan lulus.
            ucapan = "Selamat Anda Lulus";
        }else{
            // Jika nilai akhir kurang dari 75, maka berikan ucapan coba lagi.
            ucapan = "Silahkan Coba Lagi";
        }
    }
    
}
