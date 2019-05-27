package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sumOdd(1,11));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0 || start > end) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
                System.out.println(i);
            }
        }
        return sum;
    }
}
