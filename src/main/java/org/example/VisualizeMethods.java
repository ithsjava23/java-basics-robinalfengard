package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class VisualizeMethods {
    private static final int NUMBER_OF_ROWS = 5;

    public static void visualize(ArrayList<ListOfHoursAndPrices> hourAndPriceCombined) {
        ArrayList<ListOfHoursAndPrices> sortedListOfHoursAndPrices = new ArrayList<>(hourAndPriceCombined);
        sortedListOfHoursAndPrices.sort(Comparator.comparingInt(ListOfHoursAndPrices::getPrice).reversed());


        int highestValue = sortedListOfHoursAndPrices.get(0).price;
        int lowestValue =  sortedListOfHoursAndPrices.get(sortedListOfHoursAndPrices.size()-1).price;


        int everyFifth = (highestValue - lowestValue)/NUMBER_OF_ROWS;


        System.out.print(highestValue + "|");
        for (ListOfHoursAndPrices listOfHoursAndPrices : hourAndPriceCombined) {
            if (listOfHoursAndPrices.getPrice() == highestValue){
                System.out.print("  x");
            } else System.out.print("   ");
        }
        System.out.print("\n");
        int newNumber = highestValue-everyFifth;
        System.out.print("   |");
        for (ListOfHoursAndPrices listOfHoursAndPrices : hourAndPriceCombined) {
            if (listOfHoursAndPrices.getPrice()>=newNumber && listOfHoursAndPrices.getPrice()<highestValue || listOfHoursAndPrices.getPrice() ==highestValue){
                System.out.print("  x");
            }else System.out.print("   ");
        }
        System.out.print("\n");


            newNumber = newNumber-everyFifth;
            System.out.print("   |");
            for (ListOfHoursAndPrices listOfHoursAndPrices : hourAndPriceCombined) {
                if (listOfHoursAndPrices.getPrice()>=newNumber && listOfHoursAndPrices.getPrice()<highestValue || listOfHoursAndPrices.getPrice() ==highestValue){
                    System.out.print("  x");
                }else System.out.print("   ");
            }
        System.out.print("\n");


        newNumber = newNumber-everyFifth;
        System.out.print("   |");
        for (ListOfHoursAndPrices listOfHoursAndPrices : hourAndPriceCombined) {
            if (listOfHoursAndPrices.getPrice()>=newNumber && listOfHoursAndPrices.getPrice()<highestValue || listOfHoursAndPrices.getPrice() ==highestValue){
                System.out.print("  x");
            }else System.out.print("   ");
        }
        System.out.print("\n");
        newNumber = newNumber-everyFifth;
        System.out.print("   |");
        for (ListOfHoursAndPrices listOfHoursAndPrices : hourAndPriceCombined) {
            if (listOfHoursAndPrices.getPrice()>=newNumber && listOfHoursAndPrices.getPrice()<highestValue || listOfHoursAndPrices.getPrice() ==highestValue){
                System.out.print("  x");
            }else System.out.print("   ");
        }
        System.out.print("\n");

        System.out.print((lowestValue < 0) ? lowestValue + "|" : " " + lowestValue + "|");
        for (ListOfHoursAndPrices listOfHoursAndPrices : hourAndPriceCombined) {
            if (listOfHoursAndPrices.getPrice() == lowestValue || listOfHoursAndPrices.getPrice()>=lowestValue){
                System.out.print("  x");
            }else System.out.print("   ");
        }
        System.out.print("\n");


        System.out.print("   |------------------------------------------------------------------------\n");
        System.out.print("   | ");
        for(int hour = 0; hour<hourAndPriceCombined.size(); hour++){
            System.out.printf("%02d ", hour);
        }
        System.out.print("\n");

    }



}
