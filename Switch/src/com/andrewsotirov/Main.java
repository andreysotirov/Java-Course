package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value is One");
                break;
            case 2:
                System.out.println("Value is Two");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was 3, 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Was not One or Two");
                break;
        }

        char charValue = 'D';

        switch (charValue) {
            case 'A':
                System.out.println("A is found");
                break;
            case 'B':
                System.out.println("B is found");
                break;
            case 'C':
                System.out.println("C is found");
                break;
            case 'D':
                System.out.println("D is found");
                break;
            case 'E':
                System.out.println("E is found");
                break;
            default:
                System.out.println("Not found");
                break;
        }

    }
}
