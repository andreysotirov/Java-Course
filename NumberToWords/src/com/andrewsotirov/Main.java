package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        numberToWords(0);
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0){
            System.out.println("Zero");
        }
        int reverseNumber = reverse(number);
        int leadingZeroNumber = reverseNumber;

        while (reverseNumber != 0) {
            int lastDigit = reverseNumber % 10;
            switch (lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            reverseNumber /= 10;
        }
        if (getDigitCount(leadingZeroNumber) < getDigitCount(number)) {
            for (int i = 0; i < (getDigitCount(number) - getDigitCount(leadingZeroNumber)); i++) {
                System.out.print("Zero ");
            }
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            number /= 10;
            lastDigit *= 10;
            reverseNumber += lastDigit;
            reverseNumber *= 10;
        }
        return reverseNumber / 100;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0){
            return 1;
        }
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
