package org.example;

public class HourAndPriceCombined {
    String hour;
    int price;


    public HourAndPriceCombined(String hour, int price) {
        this.hour = hour;
        this.price = price;
    }


    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HourAndPriceCombined{" +
                "hour='" + hour + '\'' +
                ", price=" + price +
                '}';
    }
}
