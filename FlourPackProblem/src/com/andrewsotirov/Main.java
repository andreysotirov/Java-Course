package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(canPack(0, 5, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigBags = bigCount * 5;
        int smallBags = smallCount * 1;

        if (bigBags + smallBags == goal) {
            return true;
        }
        if (bigBags + smallBags > goal) {
            if (goal % 5 <= smallBags) {
                return true;
            }
        }
        return false;
    }
}
