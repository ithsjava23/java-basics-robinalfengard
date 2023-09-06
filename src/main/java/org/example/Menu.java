package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static ArrayList<ListOfHoursAndPrices> hourAndPriceCombined = new ArrayList<>();

    public static void run() {
        Scanner sc = new Scanner(System.in);
        String selection;
        do {
            System.out.println("""
                    Elpriser
                    ========
                    1. Inmatning
                    2. Min, Max och Medel
                    3. Sortera
                    4. Bästa Laddningstid (4h)
                    5. Visualisering
                    e. Avsluta
                    """);

            selection = sc.next();
            selection = selection.toLowerCase();

            switch (selection) {
                case "1" -> hourAndPriceCombined = InputMethod.getInput(sc);
                case "2" -> ListOfHoursAndPrices.minMax(hourAndPriceCombined);
                case "3" -> ListOfHoursAndPrices.sort(hourAndPriceCombined);
                case "4" -> ListOfHoursAndPrices.showFourBestHoursToCharge(hourAndPriceCombined);
                case "5" -> VisualizeMethods.visualize(hourAndPriceCombined);
                case "e" -> System.out.println("Vi ses nästa gång!");
                default -> System.out.print("Välj ett alternativ eller tryck e för att avsluta");
            }
        } while (!selection.equals("e"));


    }
}
