package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dimensions dimensions = new Dimensions(20, 40, 50);
        Case theCase = new Case("A1B2", "NZXT", "240W", dimensions);
        Monitor monitor = new Monitor("Predator", "Acer", 17, new Resolution(1920, 1080));
        MotherBoard motherBoard = new MotherBoard("NZ-12GT", "GIGABYTE", 4, 4, "2.44");

        PC thePC = new PC(theCase, monitor, motherBoard);
        thePC.powerUp();
    }
}
