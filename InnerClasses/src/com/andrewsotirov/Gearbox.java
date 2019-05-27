package com.andrewsotirov;

import java.util.ArrayList;
import java.util.List;

public class Gearbox {
    private List<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
        for (int i = 0; i < maxGears; i++) {
            addGear(i, 5.3);
        }
    }

    public void operateClutch(boolean in) {
        clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= maxGears) {
            gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear <= maxGears && clutchIsIn) {
            currentGear = newGear;
            System.out.println("Gear " + currentGear + " is selected.");
        } else {
            System.out.println("Gridndd...!!!");
            currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }


    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return ratio * revs;
        }
    }

}
