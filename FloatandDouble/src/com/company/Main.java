package com.company;

public class Main {

    public static void main(String[] args) {

        //width of float = 32 (4 bytes)
        float myFloatValue = 5f/3f;

        int myIntValue = 5/3;

        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d/3d;

        System.out.println("My Int Value "+ myIntValue);
        System.out.println("My float Value "+ myFloatValue);
        System.out.println("My double Value "+ myDoubleValue);



        //Assignment

        double numOfPounds = 200d;
        double numofKgs = numOfPounds * 0.45359237;

        System.out.println("Number of kgs " + numofKgs + " for " + numOfPounds + " Pounds");

    }
}
