package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Player player = new Player();

        player.name = "Andrew";
        player.health = 100;
        player.weapon = "AXE";

        int damage = 99;
        player.loseHealth(damage);
        System.out.println("Remaining health is " + player.getHealth());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health is " + player.getHealth());

        EnchancedPlayer androBache = new EnchancedPlayer("Andro Bache", 99, "SEX");
        System.out.println("Health is " + androBache.getHealth());

    }
}
