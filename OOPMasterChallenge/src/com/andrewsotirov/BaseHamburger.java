package com.andrewsotirov;

import javax.swing.*;

public class BaseHamburger {

    private String name;
    private String breadRoll;
    private String meat;
    private double priceBaseHamburger;
    private AddAdditions addAdditions;


    public BaseHamburger(String breadRoll, String meat) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.name = "Base Burger";
        this.priceBaseHamburger = 3.8;
        this.addAdditions = new AddAdditions();
    }

    public void makeBaseBurger(int tomato, int lettuce, int fries, int pickles) {
        double totalBaseBurger;
        System.out.println("Bread -> " + breadRoll);
        System.out.println("Meat -> " + meat);
        addAdditions.addAdditionsBaseBurger(tomato, lettuce, fries, pickles);
        System.out.println(this.name + " -> " + priceBaseHamburger);
        System.out.println("-----------");
        totalBaseBurger =priceBaseHamburger+ ((addAdditions.getTomatoPrice() * tomato) + (addAdditions.getLettucePrice() * lettuce) +
                (addAdditions.getFriesPrice() * fries) + (addAdditions.getPicklesPrice() * pickles));
        System.out.println("Total Price -> " + totalBaseBurger);
    }

    public double getPriceBaseHamburger() {
        return priceBaseHamburger;
    }
}
