package com.helloworld.helloworld;

public class DenganTenaryOperator {
    public static void main(String[] args) {
        // Mendefinisikan variabel 'nilai' dengan nilai 75, mewakili nilai akhir siswa.
        var nilai = 75;
        // Menggunakan tenary operator untuk menentukan pesan ucapan berdasarkan kondisi nilai.
        String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";


        // Mencetak pesan ucapan ke layar.
        System.out.println(ucapan);
    }
}
