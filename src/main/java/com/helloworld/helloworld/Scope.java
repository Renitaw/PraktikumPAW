package com.helloworld.helloworld;

public class Scope {
    static void sayHello(String name) {
        // Mendefinisikan variabel 'hello' yang berisi pesan "Hello " diikuti dengan nilai 'name'.
        String hello = "Hello " + name;
         // Memeriksa jika nilai 'name' tidak kosong atau tidak hanya berisi spasi.
        if (!name.isBlank()) {
            // Mendefinisikan variabel 'hi' yang berisi pesan "Hi " diikuti dengan nilai 'name'.
            String hi = "Hi " + name;
            // Mencetak pesan 'hi' jika kondisi terpenuhi.
            System.out.println(hi);
        }

        // Mencetak pesan 'hello' di akhir method sayHello().
        System.out.println(hello);
    }

    public static void main(String[] args) {
        // Memanggil method sayHello() dengan argumen "John" untuk menampilkan output.
        sayHello("John");
    }
}
