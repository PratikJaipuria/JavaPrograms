package com.company;

public class Main {

    public static void main(String[] args) {

        char switchValue = 'A';
        switch(switchValue){
            case 'A':
                System.out.println("Value 1 ");
                break;
            case 'B':
                System.out.println("Value 2");
            case 'C':case 'D':case 'E':
                System.out.println("Value 3 , 4 and 5");
            default:
                System.out.println("Last ");
        }


        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan ");
                break;
            case "february":
                System.out.println("Value 2");
            case "may":
                System.out.println("Value 3 , 4 and 5");
            case "june":

                System.out.println("Value 3 , 4 and 5");
            default:
                System.out.println("Last ");
        }



    //FOR LOOP

        int i = 0;
    for ( i = 8 ; i>1  ; i-- ){
        System.out.println("10,000 at " + i + " % interest = "+ String.format("%2f",calculateInterest(i,10000.00)));
    }

    int numofPrimes = 0;
    for (int j = 15; j <= 100 ; j++){

        if(isPrime(j)){
            System.out.println("Numeber:" + j + " is prime " + numofPrimes + " prime number ");
            numofPrimes++;
            if(numofPrimes > 3){
                break;
            }
        }
    }
        System.out.println("******************************************");



        //WHILE








    }


    public  static boolean isPrime(int n){
        if(n==1){
            return false;
        }

        for (int i=2 ; i < (long)Math.sqrt(n) ; i++ ){
            if(n % i == 0){
                return  false;
            }

        }
        return true;
    }

    public static double calculateInterest(double interestRate, double amt){
        return (amt * (interestRate/100));
    }
}
