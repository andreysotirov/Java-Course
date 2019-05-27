package com.andrewsotirov;

public class Suv extends Car {

    private String suspension;
    private boolean offRoad;

    public Suv(double speed, String handSteering, int changingGears, int numberTires,
               String paintColor, String suspension, boolean offRoad) {
        super(speed, handSteering, changingGears, numberTires, paintColor);
        this.suspension = suspension;
        this.offRoad = offRoad;
    }

    public String getSuspension() {
        return suspension;
    }

    public boolean isOffRoad() {
        return offRoad;
    }
}
