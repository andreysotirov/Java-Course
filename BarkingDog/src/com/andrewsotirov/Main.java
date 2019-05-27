package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(shouldWakeUp(true, 22));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking == false) {
            return false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }
        return false;
    }
}
