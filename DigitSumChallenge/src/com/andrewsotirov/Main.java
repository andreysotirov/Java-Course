package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sumDigits(12));


    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        } else {
            while (number > 0) {
                int n = number % 10; //=5
                number /= 10; //=12
                sum += n;
            }
            return sum;
        }
    }
}
