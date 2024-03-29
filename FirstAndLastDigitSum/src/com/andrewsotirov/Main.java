package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sumFirstAndLastDigit(2526));
    }

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = number % 10;
        int firstDigit = 0;

        if (number < 0) {
            return -1;
        }
        while (number != 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        int sum = lastDigit + firstDigit;
        return sum;
    }
}
