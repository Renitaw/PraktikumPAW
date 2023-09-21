package com.helloworld.helloworld;

public class SwitchDenganYield {
    public static void main(String[] args) {
         // Mendefinisikan variabel 'nilai' dengan nilai "A", mewakili kategori nilai siswa.
        var nilai ="A";

        // Memulai pernyataan switch dengan penggunaan yield untuk mengevaluasi nilai siswa.
        String ucapan = switch (nilai) {
             // Jika nilai sama dengan "A", hasilkan pesan "Wow Anda Lulus Dengan Baik".
            case "A":
            yield "Wow Anda Lulus Dengan Baik";

            // Jika nilai sama dengan "B" atau "C", hasilkan pesan "Anda Lulus".
            case "B", "C":
            yield "Anda Lulus";
            
            // Jika nilai sama dengan "D", hasilkan pesan "Anda Tidak Lulus".
            case "D":
            yield "Anda Tidak Lulus";
            
            // Jika nilai tidak sama dengan kondisi di atas, hasilkan pesan "Mungkin Anda Salah Jurusan".
            default:
            yield "Mungkin Anda Salah Jurusan";
        };
         // Mencetak pesan yang dihasilkan dari switch ke layar.
        System.out.println(ucapan);
    }
}
