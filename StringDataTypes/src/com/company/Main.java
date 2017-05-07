package com.company;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a String";
        System.out.println(myString.hashCode());
	    myString = myString + " made by meee.";
        System.out.println(myString.hashCode());


        String numberString = "1524.55";
        numberString = numberString + "95595.222";
        System.out.println("Appened string  " + numberString);

        int myInt  = 50;


        //Int is treated as string here
        numberString = numberString + myInt;
        System.out.println("Display number "+ numberString);

        numberString = "abc";

        System.out.println("Updated number string "+ numberString);





    }

}
