package com.andrewsotirov;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = readIntegers(5);
        System.out.println(findMin(intArray));

    }

    public static int[] readIntegers(int count) {

        int[] newIntArray = new int[count];
        System.out.println("Please enter " + count + " integers.");
        for (int i = 0; i < newIntArray.length; i++) {
            newIntArray[i] = scanner.nextInt();
        }
        return newIntArray;
    }

    public static int findMin(int[] array) {

        int minNumber = Integer.MAX_VALUE;
        int value = 0;

        for (int i = 0; i < array.length - 1; i++) {
            value = array[i];
            if (value<minNumber) {
                minNumber = value;
            }
        }
//            if (array[i] < array[i + 1]) {
//                minNumber = array[i];
//            } else minNumber = array[i + 1];
//        }
        return minNumber;
    }
}
