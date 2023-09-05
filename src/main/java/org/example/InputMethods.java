package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class InputMethods {

    // Get input from user and return combined list
    public static ArrayList<HourAndPriceCombined> getInput(Scanner sc) {
        ArrayList<HourAndPriceCombined> combinedData = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            System.out.println("Please enter the price for hour: " + SupportMethods.formatHour(i) + "-" + SupportMethods.formatHour(i + 1));
            String priceInput = sc.next();
            combinedData.add(new HourAndPriceCombined(SupportMethods.formatHour(i) + "-" + SupportMethods.formatHour(i + 1), Integer.parseInt(priceInput)));
        }
        return combinedData;
    }


}
