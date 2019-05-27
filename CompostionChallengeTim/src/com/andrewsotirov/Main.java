package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Wall wall1 = new Wall("WEST");
        Wall wall2 = new Wall("EAST");
        Wall wall3 = new Wall("NORTH");
        Wall wall4 = new Wall("SOUTH");

        Ceiling ceiling = new Ceiling(3, 55);

        Bed bed = new Bed("Sexy", 2, 1, 2, 1);

        Lamp lamp = new Lamp("Polilei", false, 2);

        Bedroom bedroom = new Bedroom("Andrew's sexy room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
