package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car sportsCar = new Car(220, "sports", 6, 4, "red");
        sportsCar.kph(220);
        Suv gl320 = new Suv(200, "yes", 8, 4, "black" +
                "", "offroad", true);
        System.out.println(gl320.getPaintColor());
        gl320.cycleGears();
    }
}
