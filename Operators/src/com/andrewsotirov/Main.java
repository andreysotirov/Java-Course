package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result -1;
        System.out.println(previousResult + " - 1 = " + result);

        int test = 20%7;
        System.out.println(test);

        boolean isCar = true;
        boolean wasCar = isCar ? true:false;

        if (wasCar){
            System.out.println("it is car");
        }

        double a = 20;
        double b = 80;
        double c = (a+b)*25;
        double d = c%40;
        if ( d <= 20 ){
            System.out.println("Total is over the limit");
        }
    }
}
