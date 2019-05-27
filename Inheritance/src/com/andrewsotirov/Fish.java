package com.andrewsotirov;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int finns;

    public Fish(String name, int size, int weight, int gills, int eyes, int finns) {
        super(name, 1,1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.finns = finns;
    }

    private void rest(){

    }
    private void moveMuscles(){

    }
    private void moveBackFin(){

    }
    private void swim(int speed){
        moveBackFin();
        moveMuscles();
        super.move(speed);
    }
}
