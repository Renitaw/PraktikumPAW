package com.helloworld.helloworld;

public class SwitchTanpaYield {
    public static void main(String[] args) {
        // Mendefinisikan variabel 'nilai' dengan nilai "A", mewakili kategori nilai siswa.
        var nilai = "A";

        switch (nilai) {
            // Jika nilai sama dengan "A", cetak pesan "Wow Anda Lulus Dengan Baik".
            case "A" -> System.out.println("Wow Anda Lulus Dengan Baik");
            // Jika nilai sama dengan "B" atau "C", cetak pesan "Anda Lulus".
            case "B", "C" -> System.out.println("Anda Lulus");
             // Jika nilai sama dengan "D", cetak pesan "Anda Tidak Lulus".
            case "D" -> System.out.println("Anda Tidak Lulus");
             // Jika nilai tidak sama dengan kondisi di atas, cetak pesan "Mungkin Anda Salah Jurusan".
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }
    }
    
}
