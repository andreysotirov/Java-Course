package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porshe = new Car();
        Car mercedes = new Car();

        mercedes.setModel("GL320cdi");
        System.out.println("Model is " + mercedes.getModel());
    }
}
