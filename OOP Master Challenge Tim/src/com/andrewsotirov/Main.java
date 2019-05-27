package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Fries", 1.27);
        hamburger.addHamburgerAddition3("Zele", 12) ;
        hamburger.addHamburgerAddition4("Kola", 3.5);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 5.67);
        healthyBurger.addHealthAddition1(1.25, "more bacon");
        System.out.println(healthyBurger.itemizeHamburger());

    }
}
