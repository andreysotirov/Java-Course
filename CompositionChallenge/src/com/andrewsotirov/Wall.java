package com.andrewsotirov;

public class Wall {

    private double height;
    private double width;

    public Wall(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void getWallArea(){
        double wallArea = height*width;
        System.out.println("Wall area is = " + wallArea);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
