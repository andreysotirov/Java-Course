package com.andrewsotirov;

import java.util.ArrayList;

public class Player implements ISaveable {

    private String playerName;
    private int health;
    private int strength;

    public Player(String playerName, int health, int strength) {
        this.playerName = playerName;
        this.health = health;
        this.strength = strength;
    }

    @Override
    public ArrayList<String> write() {
        return null;
    }

    @Override
    public void read(ArrayList<String> savedValues) {

    }

    @Override
    public String toString() {
        return playerName + " " + health + " " + strength;
    }
}
