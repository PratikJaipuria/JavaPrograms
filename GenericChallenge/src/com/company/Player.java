package com.company;

/**
 * Created by Pratik on 7/29/2017.
 */
public abstract class Player {
    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
