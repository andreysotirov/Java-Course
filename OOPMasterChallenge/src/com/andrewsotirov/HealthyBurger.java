package com.andrewsotirov;

public class HealthyBurger {

    private AddAdditions addAdditions;
    private String breadRoll;
    private String meat;
    private String name;
    private double priceHealthyHamburger;

    public HealthyBurger() {
        this.name = "Healthy Burger";
        this.breadRoll = "Whole Grain";
        this.meat = "Chicken";
        this.priceHealthyHamburger = 4.8;
        this.addAdditions = new AddAdditions();
    }

    public void makeHealthyBurger(int tomato, int lettuce, int fries, int pickles, int avocado, int kinoa) {
        double totalHealthyPrice;
        System.out.println("Bread -> " + breadRoll);
        System.out.println("Meat -> " + meat);
        addAdditions.addAdditionsHealthyBurger(tomato, lettuce, fries,
                pickles, kinoa, avocado);
        System.out.println(this.name + " -> " + priceHealthyHamburger);
        System.out.println("-----------");
        totalHealthyPrice = priceHealthyHamburger + ((addAdditions.getTomatoPrice() * tomato) + (addAdditions.getLettucePrice() * lettuce) +
                (addAdditions.getFriesPrice() * fries) + (addAdditions.getPicklesPrice() * pickles));
        System.out.println("Total Price -> " + totalHealthyPrice);
    }

    public double getPriceHealthyHamburger() {
        return priceHealthyHamburger;
    }
}
