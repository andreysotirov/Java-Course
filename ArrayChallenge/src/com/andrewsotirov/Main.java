package com.andrewsotirov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        int[] integerArray = getIntegers(8);
        printArray(integerArray);
//        Arrays.sort(integerArray);
//        System.out.println(Arrays.toString(integerArray));
        printArray(sortIntegers(integerArray));


    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter position " + (i + 1));
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Position " + i + " : " + array[i]);
        }
        System.out.println();
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean swapped = true;
        int j = 0;
        int tmp;

        while (swapped) {

            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {

                if (sortedArray[i] < sortedArray[i + 1]) {
                    tmp = sortedArray[i + 1];
                    sortedArray[i + 1] = sortedArray[i];
                    sortedArray[i] = tmp;
                    swapped = true;
                }
            }
        }
        return sortedArray;
    }
}
