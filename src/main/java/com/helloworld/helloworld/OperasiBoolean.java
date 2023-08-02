package com.helloworld.helloworld;

public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 80;

        var lulusanAbsen = absen >= 75;
        var lulusanNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusanAbsen && lulusanNilaiAkhir;

        System.out.println(lulus);
    }
}
