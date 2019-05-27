package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if ((a+b) == c){
            return true;
        }
        return false;
    }

}
