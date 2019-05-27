package com.andrewsotirov;

public class Floor {

    private double lenght;
    private double width;

    public Floor(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
        if (width < 0) {
            this.width = 0;
        }
        if (lenght < 0) {
            this.lenght = 0;
        }
    }
    public double getArea (){
        return this.lenght*this.width;
    }
}
