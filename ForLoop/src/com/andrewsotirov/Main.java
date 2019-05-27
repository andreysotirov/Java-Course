package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("10,000 of 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("******************");

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
        System.out.println("******************");

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 of " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("******************");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 of " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        int n = 0;
        for (int i = 149; i <= 9999; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                n++;
                if (n == 3) {
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
