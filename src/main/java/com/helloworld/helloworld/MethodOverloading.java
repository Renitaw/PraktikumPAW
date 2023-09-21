package com.helloworld.helloworld;

public class MethodOverloading {
public static void main(String[] args) {
     // Memanggil method sayHello() tanpa parameter.
    sayHello();
     // Memanggil method sayHello() dengan parameter "Renita".
    sayHello("Renita");
    // Memanggil method sayHello() dengan dua parameter "Renita" dan "Widiastuti".
    sayHello("Renita", "Widiastuti");
}
    // Mendefinisikan method sayHello() tanpa parameter.
    static void sayHello() {
         // Mencetak pesan "Hello".
        System.out.println("Hello");
    }

     // Mendefinisikan method sayHello() dengan satu parameter firstname.
    static void sayHello(String firstname) {
        // Mencetak pesan "Hello" diikuti dengan nilai firstname.
        System.out.println("Hello" + firstname);
    }

    // Mendefinisikan method sayHello() dengan dua parameter firstname dan lastname.
    static void sayHello(String firstname, String lastname) {
         // Mencetak pesan "Hello" diikuti dengan nilai firstname dan lastname.
        System.out.println("Hello" + firstname + " " + lastname);
    }
}
