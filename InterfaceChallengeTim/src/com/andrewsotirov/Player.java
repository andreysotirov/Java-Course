package com.andrewsotirov;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String playerName;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String playerName, int hitPoints, int strength) {
        this.playerName = playerName;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "AXE";
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, playerName);
        values.add(1, weapon);
        values.add(2, "" + hitPoints);
        values.add(3, "" + strength);
        return values;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            playerName = savedValues.get(0);
            weapon = savedValues.get(1);
            hitPoints = Integer.parseInt(savedValues.get(2));
            strength = Integer.parseInt(savedValues.get(3));
        }
    }
}
