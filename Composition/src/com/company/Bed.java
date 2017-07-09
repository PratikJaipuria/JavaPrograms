package com.company;

/**
 * Created by Pratik on 7/4/2017.
 */
public class Bed {
    private String style;
    private int pillows;

    public Bed(String style, int pillows) {
        this.style = style;
        this.pillows = pillows;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public void make(){
        System.out.println("Bed making");
    }
}
