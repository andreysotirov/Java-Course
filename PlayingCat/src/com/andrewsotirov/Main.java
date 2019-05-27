package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,38));
        System.out.println(isCatPlaying(false,35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45){
                return true;
            }else return false;

        }
        if (!summer){
            if (temperature >=25 && temperature <= 35){
                return true;
            }else return false;
        }
        return false;
    }
}
