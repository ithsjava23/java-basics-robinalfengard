package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class VisualizeMethods {
    private static final int NUMBER_OF_SEPARATIONS = 5;

    public static void visualize(ArrayList<ListOfHoursAndPrices> hourAndPriceCombined) {
        ArrayList<ListOfHoursAndPrices> sortedListOfHoursAndPrices = new ArrayList<>(hourAndPriceCombined);
        sortedListOfHoursAndPrices.sort(Comparator.comparingInt(ListOfHoursAndPrices::getPrice).reversed());

        // Get highest and lowest value
        int highestValue = sortedListOfHoursAndPrices.get(0).price;
        int lowestValue =  sortedListOfHoursAndPrices.get(sortedListOfHoursAndPrices.size()-1).price;

        // Calculate distance between separators
        double everyFifth = (lowestValue > 0) ? (double) (highestValue - lowestValue) / NUMBER_OF_SEPARATIONS : (double) (highestValue + Math.abs(lowestValue)) / NUMBER_OF_SEPARATIONS;

        // Print and check for the data between the lowest and high values
        double newNumber = highestValue;

        for(int i = 0; i< NUMBER_OF_SEPARATIONS; i++){
            System.out.print(i == 0 ?  highestValue + "|" : "   |");
            for (ListOfHoursAndPrices listOfHoursAndPrices : hourAndPriceCombined) {
                if (listOfHoursAndPrices.getPrice()>=(int)newNumber && listOfHoursAndPrices.getPrice()<highestValue || listOfHoursAndPrices.getPrice() == highestValue){
                    System.out.print("  x");
                }else System.out.print("   ");
            }
            System.out.print("\n");
            newNumber = (newNumber - everyFifth);
        }


        // Print lowest value and check for data that is equal to the lowest value
        System.out.print((lowestValue < 0) ?  lowestValue + "|" : " " + lowestValue + "|");
        for (ListOfHoursAndPrices listOfHoursAndPrices : hourAndPriceCombined) {
            if (listOfHoursAndPrices.getPrice() == lowestValue || listOfHoursAndPrices.getPrice()>=lowestValue){
                System.out.print("  x");
            }else System.out.print("   ");
        }
        System.out.print("\n");

        // Print a long line to separate and print the hours of the day
        System.out.print("   |------------------------------------------------------------------------\n");
        System.out.print("   |");
        for(int hour = 0; hour<hourAndPriceCombined.size(); hour++){
            System.out.printf(" %02d", hour);
        }
        System.out.print("\n");
    }
}