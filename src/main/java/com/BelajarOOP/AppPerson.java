package com.BelajarOOP;

public class AppPerson {
    public static void main(String[] args) {
        var person = new Person(null, null);

        person.name = "Renita Widiastuti";
        person.address = "Tangerang";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
        
        person.sayHello(" Friend");
    }

}
