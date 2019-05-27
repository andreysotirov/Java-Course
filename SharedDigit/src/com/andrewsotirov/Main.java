package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(hasSharedDigit(12, 23));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10) || (a > 99) || (b < 10) || (b > 99)) {
            return false;
        }
//        12 21     2  1  1 2
        int lastDigitA = a % 10;
        a /= 10;
        int firstDigitA = a % 10;
        a /= 10;
        int lastDigitB = b % 10;
        b /= 10;
        int firstDigitB = b % 10;
        b /= 10;
        if (firstDigitA == firstDigitB || firstDigitA == lastDigitB || lastDigitA == firstDigitB || lastDigitA == lastDigitB) {
            return true;
        }
        return false;
    }
}
