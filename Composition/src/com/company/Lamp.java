package com.company;

/**
 * Created by Pratik on 7/4/2017.
 */
public class Lamp {
    private String style;
    private Boolean battery;

    public Lamp(String style, Boolean battery) {
        this.style = style;
        this.battery = battery;
    }

    public String getStyle() {
        return style;
    }

    public Boolean getBattery() {
        return battery;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning On");
    }
}
