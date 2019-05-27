package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println();
        System.out.println("WELCOME TO ANDREW'S BURGERS" +"\n\n"
                            + "***************************" + "\n");

        BaseHamburger hamburger = new BaseHamburger("White", "Pork");
        hamburger.makeBaseBurger(1, 1, 1, 1);

        System.out.println("********************************");

        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.makeHealthyBurger(1, 1, 1, 1, 1, 1);
        System.out.println(healthyBurger.getPriceHealthyHamburger());
        System.out.println(hamburger.getPriceBaseHamburger());

        System.out.println("********************************");

        DeluxeBurger deluxeBurger = new DeluxeBurger("beef", "white with susamee");
        deluxeBurger.makeDeluxeBurger();
        System.out.println(deluxeBurger.getPriceDeluxeBurger());


    }
}
