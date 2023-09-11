package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class InputMethod {

    // Get input from user and return combined list
    public static ArrayList<ListOfHoursAndPrices> getInput(Scanner sc) {


        ArrayList<ListOfHoursAndPrices> combinedData = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            boolean validInput = false;
            int price = 0;
            while(!validInput) {
                try {
                    System.out.print("Please enter the price for hour: " + SupportMethods.formatHour(i) + "-" + SupportMethods.formatHour(i + 1) + "\n");
                    String priceInput = sc.next();
                    price = Integer.parseInt(priceInput);
                    validInput = true;
                } catch (NumberFormatException ne) {
                    System.out.print("You must enter a number to proceed");
                }
            }
            combinedData.add(new ListOfHoursAndPrices(SupportMethods.formatHour(i) + "-" + SupportMethods.formatHour(i + 1), price));

        }
        return combinedData;
    }

// %02d istället för formatteringsmetoden
}