package org.example;

import java.util.Locale;


public class App {

    public static void main(String[] args) {
        //TODO
        // Bygga ihop looperna i visualisering
        // Städa & organisera
        Locale swedishLocale = new Locale("sv", "SE");
        Locale.setDefault(swedishLocale);
        Menu.run();



    }
}