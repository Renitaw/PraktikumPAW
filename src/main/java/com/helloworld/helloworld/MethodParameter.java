package com.helloworld.helloworld;

public class MethodParameter {
    public static void main(String[] args){
        // Memanggil method sayHello() dengan dua parameter: "Renita" dan "Widiastuti".
        sayHello("Renita", "Widiastuti");
    }
    // Mendefinisikan method static void sayHello() dengan dua parameter firstName dan lastName.
    static void sayHello(String firstName, String lastName){
        // Mencetak pesan "Hello" diikuti dengan nilai firstName dan lastName.
        System.out.println("Hello" + firstName + "" + lastName);
    }
}
