package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(areEqualByTreeDecimalPlaces(-3.175, -3.176));
    }

    public static boolean areEqualByTreeDecimalPlaces(double numberOne, double numberTwo) {
        numberOne *= 1000;
        numberTwo *= 1000;

        if ((int) numberOne == (int) numberTwo) {
            return true;
        }

        return false;
    }
}
