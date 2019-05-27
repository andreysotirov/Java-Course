package com.andrewsotirov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
//        boolean first = true;

        while (true) {

            System.out.println("Enter number");

            boolean isAnInt = scanner.hasNextInt();


            if (isAnInt) {

                int number = scanner.nextInt();

//                if (first) {
//                    minNumber = number;
//                    maxNumber = number;
//                    first = false;
//                }

                if (number > maxNumber) {
                    maxNumber = number;
                }

                if (number < minNumber) {
                    minNumber = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min number = " + minNumber + " Max number = " + maxNumber);
        scanner.close();
    }
}
