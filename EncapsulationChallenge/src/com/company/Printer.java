package com.company;

/**
 * Created by Pratik on 7/4/2017.
 */
public class Printer {
    private int tonerLevel;
    private int numberofPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.duplex = duplex;
        this.numberofPagesPrinted = 0;
        if (tonerLevel > -1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }

    }

    public int fillToner(int tonerValue){
        if (tonerValue> 0 && this.tonerLevel + tonerValue <= 100) {
            this.tonerLevel += tonerValue;
            return tonerLevel;
        }
        else {
            return -1;
        }
    }

    public int simulatePrinting(int pages){
        int pagestoPrint = pages;
        if (this.duplex){
            pagestoPrint /=2;
            System.out.println("Printing in duplex mode");
        }

        this.numberofPagesPrinted += pagestoPrint;
        return this.numberofPagesPrinted;



    }
}
