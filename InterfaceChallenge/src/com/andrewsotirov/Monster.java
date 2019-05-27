package com.andrewsotirov;

import java.util.ArrayList;

public class Monster implements ISaveable {

    private String monsterName;
    private int health;
    private int strength;

    public Monster(String monsterName, int health, int strength) {
        this.monsterName = monsterName;
        this.health = health;
        this.strength = strength;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> monsters = new ArrayList<>();
        monsters.add(new Monster(monsterName, health, strength).toString());
        return monsters;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        for (int i = 0; i < savedValues.size(); i++) {
            System.out.println(savedValues.get(i));
        }

    }
    @Override
    public String toString() {
        return monsterName + " " + health + " " + strength;
    }
}
