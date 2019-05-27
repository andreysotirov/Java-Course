package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(hasSameLastDigit(9,32,999));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000) {
            return false;
        }
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;
        if (lastDigitA == lastDigitC || lastDigitA == lastDigitB || lastDigitB == lastDigitC){
            return true;
        }
        return false;
    }
    public static boolean isValid (int number){
        if (number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
