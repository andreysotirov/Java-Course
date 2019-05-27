package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int newScore = calculateScore("Andrew", 800);
        System.out.println("New score is = " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(0, 1);
        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double centimeters = (feet * 12 * 2.54);
            centimeters += inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches" + " equals = " + centimeters + " centimeters.");
            return centimeters;
        } else
            System.out.println("Invalid value entered");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainInches = (int) inches % 12;
            System.out.println(inches + " inches are equal to " + feet + " feet and " + remainInches + " inches");
            return calcFeetAndInchesToCentimeters(feet,remainInches);
        }
        return -1;
    }
}
