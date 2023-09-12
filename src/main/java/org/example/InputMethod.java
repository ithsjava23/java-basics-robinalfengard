package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class InputMethod {

    // Get input from user and return combined list
    public static ArrayList<ListOfHoursAndPrices> getInput(Scanner sc) {
        ArrayList<ListOfHoursAndPrices> combinedHoursAndPrices = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            boolean validInput = false;
            int price = 0;
            while (!validInput) {
                try {
                    System.out.printf("Please enter the price for hour: %02d-%02d\n", (i), (i + 1));
                    String priceInput = sc.nextLine();
                    price = Integer.parseInt(priceInput);
                    validInput = true;
                } catch (NumberFormatException ne) {
                    System.out.print("You must enter a number to proceed");
                }
            }
            combinedHoursAndPrices.add(new ListOfHoursAndPrices(SupportMethods.formatHour(i) + "-" + SupportMethods.formatHour(i + 1), price));
        }
        return combinedHoursAndPrices;
    }
}