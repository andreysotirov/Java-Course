package com.andrewsotirov;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        // write your code here
//        int[] myIntArray = new int[25];
////        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
////        myIntArray[5] = 50;
////        double[] myDoubleArray = new double[10];
////        myDoubleArray[2] = 2.3;
////        System.out.println(myIntArray[5]);
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//    }
//    public static void printArray(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Position " + i + " : " + array[i]);
//        }
        int[] integerArray = getIntegers(5);
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println("Element " + i + " Number : " + integerArray[i]);
        }
        System.out.println("Average is " + getAverage(integerArray));
    }

    public static int[] getIntegers(int arraySize) {

        System.out.println("Enter " + arraySize + " integer values.\r");
        int[] values = new int[arraySize];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum/array.length;
    }
}
