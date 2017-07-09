package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer printer1 = new Printer(50,false);
        printer1.fillToner(75);
        System.out.println("Pages printed are " + printer1.simulatePrinting(10));
        Printer printer2 = new Printer(50,true);
        printer2.fillToner(25);
        System.out.println("Pages printed are " + printer2.simulatePrinting(15));
    }
}
