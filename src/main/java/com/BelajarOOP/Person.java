package com.BelajarOOP;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paraName, String paramAddress){
        name = paraName;
        address = paramAddress;
    }
    void sayHello(String paraName){
        System.out.println("Selamat Pagi" + paraName + ", Nama Saya" + name);
    }
}
