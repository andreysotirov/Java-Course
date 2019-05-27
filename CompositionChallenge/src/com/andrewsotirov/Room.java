package com.andrewsotirov;

public class Room {

    private Wall wall;
    private Furniture furniture;
    private Technology technology;

    public Room(Wall wall, Furniture furniture, Technology technology) {
        this.wall = wall;
        this.furniture = furniture;
        this.technology = technology;
    }

    public void getRoomWallArea() {
        wall.getWallArea();
    }

    public void whatTech(){
        if(technology.isThereTV()){
            System.out.println("There is TV");
        }else System.out.println("There is no TV");

    }
}
