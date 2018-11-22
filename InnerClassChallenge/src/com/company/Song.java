package com.company;

/**
 * Created by Pratik on 7/9/2017.
 */
public class Song {
    private String title;
    private double duration;

    public Song(String name, double duration){
        this.title = name;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return this.title + ":" + this.duration;
    }

}