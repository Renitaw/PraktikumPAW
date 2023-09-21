package com.helloworld.helloworld;

public class SwitchStatement {
    public static void main(String[] args) {
        // Mendefinisikan variabel 'nilai' dengan nilai "A", mewakili kategori nilai siswa.
        var nilai = "A";

        // Memulai pernyataan switch untuk mengevaluasi nilai siswa.
        switch (nilai){
            // Jika nilai sama dengan "A", cetak pesan "Wow Anda lulus dengan baik".
            case "A":
                System.out.println("Wow Anda lulus dengan baik");
                break;
                // Jika nilai sama dengan "B" atau "C", cetak pesan "Anda lulus".
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
                // Jika nilai sama dengan "D", cetak pesan "Anda Tidak lulus".
            case "D":
                System.out.println("Anda Tidak lulus");
                break;
                // Jika nilai tidak sama dengan kondisi di atas, cetak pesan "Mungkin anda salah jurusan aowkoaokwo".
            default:
                System.out.println("Mungkin anda salah jurusan aowkoaokwo");
        }
    }
}
