package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-561500);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
