package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingAndCompareMethods {
    // Sort and print result (descending order)
    public static void sort(ArrayList<HourAndPriceCombined> listOfPricesAndHours) {
        listOfPricesAndHours.sort(Comparator.comparingInt(HourAndPriceCombined::getPrice).reversed());
        for (HourAndPriceCombined listOfPricesAndHour : listOfPricesAndHours) {
            System.out.println(listOfPricesAndHour.getHour() + " " + listOfPricesAndHour.getPrice() + " öre");
        }
    }


    // Check for minimum  maximum and average values
    public static void minMax(ArrayList<HourAndPriceCombined> listOfPricesAndHours) {
        // Sort combined list (ascending order)
        listOfPricesAndHours.sort(Comparator.comparingInt(HourAndPriceCombined::getPrice));
        double sumOfPrice = 0;
        for (HourAndPriceCombined listOfPricesAndHour : listOfPricesAndHours) {
            sumOfPrice += listOfPricesAndHour.getPrice();
        }
        // Format and print result
        String formattedText = String.format("""
                        Lägsta pris: %s, %s öre/kWh
                        Högsta pris: %s, %s öre/kWh
                        Medelpris: %s öre/kWh
                        """, listOfPricesAndHours.get(0).getHour(), listOfPricesAndHours.get(0).getPrice(),
                listOfPricesAndHours.get(listOfPricesAndHours.size() - 1).getHour(),
                listOfPricesAndHours.get(listOfPricesAndHours.size() - 1).getPrice(),
                String.format("%.2f", SupportMethods.getAverage(sumOfPrice, listOfPricesAndHours.size())));

        System.out.println(formattedText);
    }

    // Show 4 best hours to charge
    public static void showFourBestHoursToCharge(ArrayList<HourAndPriceCombined> listOfPricesAndHours) {
        double bestTime = listOfPricesAndHours.get(0).getPrice() + listOfPricesAndHours.get(1).getPrice() + listOfPricesAndHours.get(2).getPrice() + listOfPricesAndHours.get(3).getPrice();
        Object startChargeAtHour;
        int indexOfStartingHour = 0;
        for (int i = 1; i < listOfPricesAndHours.size() - 3; i++) {
            double challengeTime = listOfPricesAndHours.get(i).getPrice() + listOfPricesAndHours.get(i + 1).getPrice() + listOfPricesAndHours.get(i + 2).getPrice() + listOfPricesAndHours.get(i + 3).getPrice();
            if (bestTime > challengeTime) {
                bestTime = challengeTime;
                startChargeAtHour = listOfPricesAndHours.get(i);
                indexOfStartingHour = listOfPricesAndHours.indexOf(startChargeAtHour);
            }
        }

        // Average öre/kWh formatted and printed
        String firstHour = listOfPricesAndHours.get(indexOfStartingHour).getHour().substring(0, 2);
        String formattedAverage = String.format("%.1f", SupportMethods.getAverage(bestTime, 4));
        System.out.println("Påbörja laddning klockan " + firstHour + "\n" +
                "Medelpris 4h: " + formattedAverage + " öre/kWh");
    }
}
