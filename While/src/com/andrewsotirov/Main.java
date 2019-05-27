package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isEvenNumber(3));
        int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }
        count = 0;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        count = 0;
        do {
            System.out.println("Count value is " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);
        int number = 4;
        int finishNumber = 20;
        int countEvenNumber = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            countEvenNumber++;
            if (countEvenNumber == 5){
                System.out.println("Total numbers found " + countEvenNumber);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
