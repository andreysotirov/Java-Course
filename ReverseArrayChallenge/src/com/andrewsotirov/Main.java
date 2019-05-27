package com.andrewsotirov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] myArray = {1, 22, 333, 413, 5453};
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static void reverse(int[] array) {
        int length = array.length - 1;
        int[] reverseArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[length - i];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(reverseArray[i]);
        }


    }
}

