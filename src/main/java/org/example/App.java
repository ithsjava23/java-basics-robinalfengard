package org.example;

import java.util.Locale;


public class App {

    public static void main(String[] args) {
        // test again
        Locale swedishLocale = new Locale("sv", "SE");
        Locale.setDefault(swedishLocale);
        Menu.run();


    }
}