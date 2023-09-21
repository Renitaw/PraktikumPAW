package com.helloworld.helloworld;

public class ForEach {
    public static void main(String[] args){
         // Mendefinisikan array string dengan beberapa elemen.
        String[] array ={
            "Renita", "Widiastuti", "Sayur", "Sayur"
        };// Memulai perulangan for-each untuk mengiterasi melalui setiap elemen dalam array.
        for (var value : array) {
             // Mencetak nilai elemen saat ini.
            System.out.println(value);
        }
    }
}
