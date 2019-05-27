package com.andrewsotirov;

public class Car extends Vehicle {

    private int changingGears;
    private int numberTires;
    private String paintColor;

    public Car(double speed, String handSteering, int changingGears, int numberTires, String paintColor) {
        super(speed, handSteering);
        this.changingGears = changingGears;
        this.numberTires = numberTires;
        this.paintColor = paintColor;
    }

    public int getChangingGears() {
        return changingGears;
    }

    public int getNumberTires() {
        return numberTires;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public void cycleGears() {
        for (int i = 1; i <= changingGears; i++) {
            System.out.println("Your gear is " + i + " maniac");
        }
    }

    @Override
    public void kph(double speed) {
        System.out.println("Sports car move faster than normal car " + (speed + 50));
        super.kph(speed);
    }
}
