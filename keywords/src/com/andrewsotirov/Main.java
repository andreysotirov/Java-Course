package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score is " + finalScore);
            int secondFinalScore = secondScore + (secondLevelCompleted*secondBonus);
            System.out.println("Second final score is " + secondFinalScore);
        }

    }
}
