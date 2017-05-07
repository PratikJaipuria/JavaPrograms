package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Pratik", 500);
        System.out.println("New score is " +newScore);
        newScore = calculateScore(250);
        System.out.println("New score is " +newScore);

        calcFeetAndInchesToCentimeters(0,6);
        //Challenge



    }



    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double inchesToCM,feetToCM;
        if (feet >= 0){
            if(inches >=0 && inches <=12){
                inchesToCM = inches * 2.54;
                feetToCM = feet * 12 * 2.54;
//                System.out.println("Inches to cm " + inchesToCM);
//                System.out.println("Feets to cm " + feetToCM);
                System.out.println("feet " + feet + "and inches " + inches+ " = " + feetToCM + inchesToCM);
                return  feetToCM + inchesToCM;
            }
        }
        return -1;
    }


    public static double calcFeetAndInchesToCentimeters(double inches){
        double inchesToCM,feetToCM;
        if(inches >=0){
                inchesToCM = inches * 2.54;
                feetToCM = inchesToCM * 12;
                System.out.println("Inches to cm " + inchesToCM);
                System.out.println("Feets to cm " + feetToCM);

        }
        return -1;
    }


    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return  score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return  score*1000;
    }
}
