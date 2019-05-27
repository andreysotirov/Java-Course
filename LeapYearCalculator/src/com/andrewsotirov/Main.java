package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isLeapYear(-1600));
    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }
        if (year%4 != 0){
            return false;
        }else if(year%100 != 0 || year%400 == 0){
            return true;
        }
        return false;
    }
}
