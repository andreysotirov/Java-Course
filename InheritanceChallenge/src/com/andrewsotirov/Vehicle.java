package com.andrewsotirov;

public class Vehicle {

    private double speed;
    private String handSteering;

    public Vehicle(double speed, String handSteering) {
        this.speed = speed;
        this.handSteering = handSteering;
    }

    public void kph (double speed){
        System.out.println("You will move " + speed + " km/h");
    }

    public double getSpeed() {
        return speed;
    }

    public String getHandSteering() {
        return handSteering;
    }
}
