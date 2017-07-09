package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern",4);

        Lamp lamp = new Lamp("Classic",false);

        Bedroom bedroom = new Bedroom("PRatik's", wall1,wall2,wall3,wall4,ceiling,lamp,bed);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();


    }
}
