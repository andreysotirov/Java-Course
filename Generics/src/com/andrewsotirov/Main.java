package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {


        BaseballPlayer tim = new BaseballPlayer("Tim");
        BasketballPlayer kiro = new BasketballPlayer("Kiro");
        FootballPlayer drew = new FootballPlayer("Drew");

        Team<FootballPlayer> cska = new Team<>("CSKA");
        Team<FootballPlayer> lefski = new Team<>("LEFSKI");
//        cska.addPlayer(tim);
//        cska.addPlayer(kiro);
        cska.addPlayer(drew);

        System.out.println(cska.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Ludogorski orli");
        baseballTeam.addPlayer(tim);

        cska.matchResult(lefski, 10, 0);
        lefski.matchResult(cska, 0, 11);

        System.out.println(cska.compareTo(lefski));
        System.out.println(lefski.compareTo(cska));

    }
}
