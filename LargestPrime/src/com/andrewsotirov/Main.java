package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getLargestPrime(16));
    }

    public static int getLargestPrime(int number) {
        int count = 0;
        int largestPrime = 0;

        if (number <= 1) {
            return -1;
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {

                if (number % i == 0) {
                    count++;
                }

                if (count == 2) {
                    largestPrime = i;
                    break;
                }
            }
            largestPrime = i;
        }
        return largestPrime;
    }
}
