package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall = new Wall(2.3, 4);
        Furniture furniture =new Furniture("Golqm Divan", 1, 4);
        Technology technology = new Technology(true, false);

        Room room = new Room(wall,furniture, technology);
        room.getRoomWallArea();
        room.whatTech();
    }
}
