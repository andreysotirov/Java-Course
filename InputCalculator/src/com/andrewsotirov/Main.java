package com.andrewsotirov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(11/3);
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int count = 0;

        while (true) {
            System.out.println("Please enter number");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                average =(double) sum / count;
                average = Math.round(average);
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + (int)average);
        scanner.close();
    }
}
