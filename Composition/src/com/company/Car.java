package com.company;

/**
 * Created by Pratik on 7/4/2017.
 */
public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity){
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
