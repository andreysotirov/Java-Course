package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(area(5));
        System.out.println(area(-1));
        System.out.println(area(5,4));
        System.out.println(area(-1,4));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double s = radius*radius*Math.PI;
        return s;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1.0;
        }
        double s = x*y;
        return s;
    }
}
