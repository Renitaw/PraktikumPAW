package com.BelajarOOP;

public class AppManager {    
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Desta";
        manager.sayHello("Renita");

        var vicePresident = new VicePresident();
        vicePresident.name = "Atikananda";
        vicePresident.sayHello("Tuti");
    }
}
