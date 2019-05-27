package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        int firstDivisor = 0;

        if (first < 10 || second < 10) {
            return -1;
        }
        for (int i = 1; ((i <= first) && (i <= second)); i++) {

            int firstModulo = first % i;
            int secondModulo = second % i;
            if (firstModulo == 0 && secondModulo ==0){
                firstDivisor = i;
            }
        }

        return firstDivisor;
    }
}
