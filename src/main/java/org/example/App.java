package org.example;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        new Locale("sv","SE");
        Scanner sc = new Scanner(System.in);
        Menu.run(sc);

    }
}
