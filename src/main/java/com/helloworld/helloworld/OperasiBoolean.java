package com.helloworld.helloworld;

public class OperasiBoolean {
    public static void main(String[] args) {
        // Mendefinisikan variabel 'absen' dengan nilai 70, mewakili presentase kehadiran.
        var absen = 70;
        // Mendefinisikan variabel 'nilaiAkhir' dengan nilai 80, mewakili nilai akhir siswa.
        var nilaiAkhir = 80;

        // Memeriksa apakah presentase kehadiran ('absen') mencukupi untuk lulus.
        var lulusanAbsen = absen >= 75;
         // Memeriksa apakah nilai akhir ('nilaiAkhir') mencukupi untuk lulus.
        var lulusanNilaiAkhir = nilaiAkhir >= 75;
         // Menggabungkan hasil dari pengecekan kehadiran dan nilai akhir menggunakan operator logika AND (&&).
        var lulus = lulusanAbsen && lulusanNilaiAkhir;

        // Mencetak hasil akhir apakah siswa lulus atau tidak berdasarkan kondisi gabungan.
        System.out.println(lulus);
    }
}
