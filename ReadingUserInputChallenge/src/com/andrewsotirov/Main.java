package com.andrewsotirov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        System.out.println("Please enter 10 numbers");
        int count = 1;
        int sum = 0;
        {
            while (count != 11) {
                boolean hasNextInt = scanner.hasNextInt();
                if (hasNextInt) {
                    int number = scanner.nextInt();
                    System.out.println("Number " + count + " is = " + number);
                    count++;
                    sum += number;
                } else {
                    System.out.println("Please enter valid number");
                }
                scanner.nextLine();
            }
            scanner.close();
            System.out.println("The sum is = " + sum);
        }
    }
}
