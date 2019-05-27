package com.andrewsotirov;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Player died");
        }
    }

    public int getHealth() {
        return health;
    }
}
