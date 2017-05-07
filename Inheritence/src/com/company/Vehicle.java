package com.company;

/**
 * Created by Pratik on 5/6/2017.
 */
public class Vehicle {
    private String name;
    private int size;
//    private int speed;
//    private int gears;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name,int size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.currentDirection + "degrees.");
    }


    public void move(int velocity, int direction){
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at "+this.currentVelocity +"in direction" + this.currentDirection );
    }


    public  void  stop(){
        this.currentVelocity = 0;

    }
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }


}
