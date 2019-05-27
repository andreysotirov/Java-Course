package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int number) {

        int original = number;
        int lastDigit = 0;
        int reverse = 0;

        while (number != 0) {
            reverse *= 10;  //10      //1210
            lastDigit = number % 10;//1
            reverse += lastDigit; //1           //121%10 =1 12%10=2 1%10=1
            number /= 10; //1
        }
        if (reverse == original) {
            return true;
        } else {
            return false;
        }
    }
}
