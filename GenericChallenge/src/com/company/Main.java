package com.company;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adalaideCrows = new Team<>("Adeldide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> freemantle = new Team<>("Freemantle");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago cubs");

        hawthorn.matchResult(freemantle,1,0);
        hawthorn.matchResult(adalaideCrows,3,8);

        adalaideCrows.matchResult(freemantle,2,1);

        footballLeague.add(adalaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(freemantle);
        footballLeague.add(hawthorn);


        footballLeague.showLeagueTable();

    }
}
