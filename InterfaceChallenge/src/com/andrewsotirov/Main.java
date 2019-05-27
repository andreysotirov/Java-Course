package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Monster monster = new Monster("Kur", 2, 1);
        monster.read(monster.write());
    }
}
