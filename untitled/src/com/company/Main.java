package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please enter the size of array:\r");
        int number = scanner.nextInt();
        int [] unsortedArray = getArray(number);

        for (int i = 0 ; i <= unsortedArray.length ; i++){
            System.out.println(unsortedArray[i]);
        }
    }

    public static int[] getArray(int number){
        int [] inputArray = new int[number];
        System.out.println("Please enter elements:\r");
        for (int i = 0 ; i <= inputArray.length ; i++){
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }
}
