package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte a = 31;
        short b = 736;
        int c = 12342;
        long d = 1_222_234;

        long e = 50000 + (a+b+c+d);

        System.out.println(e);
    }
}
