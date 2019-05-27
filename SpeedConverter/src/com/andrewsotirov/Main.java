package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printConversion(-5.6);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double milesPerHour = kilometersPerHour / 1.609;
        long roundedMilesPerHour = Math.round(milesPerHour);

        return roundedMilesPerHour;
    }

    public static void printConversion (double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
