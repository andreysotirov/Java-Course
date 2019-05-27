package com.andrewsotirov;

public class DeluxeBurger {

    private String meat;
    private String breadRoll;
    private double priceDeluxeBurger;
    private String name;
    private double chipsPrice;
    private double colaPrice;

    public DeluxeBurger(String meat, String breadRoll) {
        this.meat = meat;
        this.breadRoll = breadRoll;
        this.priceDeluxeBurger = 11.20;
        this.name = "Deluxe Burger";
        this.chipsPrice = 3.2;
        this.colaPrice = 1.8;
    }

    public void makeDeluxeBurger() {
        double totalDeluxeBurger = chipsPrice + colaPrice + priceDeluxeBurger;
        System.out.println("Bread -> " + breadRoll);
        System.out.println("Meat -> " + meat);
        System.out.println(this.name + " -> " + priceDeluxeBurger);
        System.out.println("Chips -> " + chipsPrice);
        System.out.println("Cola -> " + colaPrice);
        System.out.println("-----------");
        System.out.println("Total Price -> " + totalDeluxeBurger);
    }

    public double getPriceDeluxeBurger() {
        return priceDeluxeBurger;
    }
}
