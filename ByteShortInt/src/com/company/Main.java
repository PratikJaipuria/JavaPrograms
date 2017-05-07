package com.company;

public class Main {

    public static void main(String[] args) {

        // Integer has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;


        // byte has a width of 8
        byte myByteValue = 127;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("My New Byte Value " + myNewByteValue);

        // Short has a width of 16
        short myShortValue = -32768;

        // long has a width of 64
        long myLongValue = 100L;


        //Assignment

        byte byteVar = 10;
        short shortVar = 5;
        int intVar = 20;

        long computation;
        computation = 50000L + 10L*(byteVar + shortVar + intVar);
        System.out.println("Value for computation "+computation);




    }
}
