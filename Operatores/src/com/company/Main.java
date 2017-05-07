package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 15 % 2;
        System.out.println("Result of the operation " + result);

        int topScore = 100;

        if (topScore > 80 && result > 5)
            System.out.println("Hey u got it");

        double firstNum = 20d;
        double secondNum = 80d;
        double resultnew = (firstNum + secondNum) * 25;
        double remainder = resultnew % 40;
        System.out.println("Value of remainder " + remainder);
        if (remainder <= 20)
            System.out.println("Total was over the limit");

    }
}
