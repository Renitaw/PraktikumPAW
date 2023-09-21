package com.helloworld.helloworld;

public class SwitchLambada {
    public static void main(String[] args) {
          // Mendefinisikan variabel 'nilai' dengan nilai "A", mewakili kategori nilai siswa.
        var nilai = "A";

        // Memulai pernyataan switch dengan menggunakan lambda expression untuk mengevaluasi nilai siswa.
        switch (nilai){
            // Jika nilai sama dengan "A", cetak pesan "Wow anda lulus dengan baik".
            case "A" -> System.out.println("Wow anda lulus dengan baik");
            // Jika nilai sama dengan "B" atau "C", cetak pesan "Anda Lulus".
            case "B", "C" -> System.out.println("Anda Lulus");
             // Jika nilai sama dengan "D", cetak pesan "Anda Tidak Lulus".
            case "D" -> System.out.println("Anda Tidak Lulus");
             // Jika nilai tidak sama dengan kondisi di atas, cetak pesan "Mungkin anda salah jurusan".
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }
    }
}
