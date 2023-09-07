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
}