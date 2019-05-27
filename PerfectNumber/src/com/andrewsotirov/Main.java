package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        isPerfectNumber(6);
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 1) {
            return false;
        }
        for (int i = 1; i < number; i++){
            if (number%i == 0){
                sum += i;
            }
            if (sum == number){
                return true;
            }
        }
        return false;
    }
}
