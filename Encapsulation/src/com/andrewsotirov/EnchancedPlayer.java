package com.andrewsotirov;

public class EnchancedPlayer {

    private String name;
    private int health = 80;
    private String weapon;

    public EnchancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }
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
