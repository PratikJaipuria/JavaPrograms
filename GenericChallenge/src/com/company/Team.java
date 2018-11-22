package com.company;

import java.util.ArrayList;

/**
 * Created by Pratik on 7/29/2017.
 */
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int loss = 0;
    int tied = 0;

    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println("Player " + player.getName() + " already exists");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName() + " pick for the team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;

        if(ourScore > theirScore){
            won++;
            message = " beat ";
        }else if(theirScore > ourScore){
            loss++;
            message = " lost to ";
        }else {
            tied++;
            message = " drew with ";
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        }else {
            return 0;
        }

    }
}
