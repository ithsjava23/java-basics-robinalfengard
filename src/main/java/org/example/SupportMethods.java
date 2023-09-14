package org.example;

public class SupportMethods {
    public static float getAverage(double number, int toDivideWith) {
        return (float) (number / toDivideWith);
    }

    // format hours with zeroes up to hour 10
    public static String formatHour(int hour) {
        if (hour < 10) {
            return "0" + hour;
        } else {
            return Integer.toString(hour);
        }
    }

    // method to format spaces accordingly to how many numbers highest and lowest value includes in the visualization
    public static String formatSpaces(int value) {
        if (value < 10 && value > 0) {
            return "  " + value + "|";
        } else if (value > 9 && value < 100) {
            return " " + value + "|";
        } else if (value < 0) {
            return value + "|";
        } else return value + "|";
    }
}