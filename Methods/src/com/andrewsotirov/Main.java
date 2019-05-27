package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
//        int levelCompleted = 5;
//        System.out.println(calculateScore(true, 200, levelCompleted, 50));
//
//    }
//
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            return finalScore;
//        }
//        return -1;

        displayHighScorePosition("Andro", calculateHighScorePositon(1500));
        displayHighScorePosition("Pesho", calculateHighScorePositon(900));
        displayHighScorePosition("Mitko", calculateHighScorePositon(300));
        displayHighScorePosition("Vlado", calculateHighScorePositon(10));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table.");
    }

    public static int calculateHighScorePositon(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;

    }

}

