package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please enter the size of array:\r");
        int number = scanner.nextInt();
        int [] unsortedArray = getArray(number);


//        New Array to be sorted
        int [] tobesorted = new int[number];
        tobesorted = unsortedArray;
        int [] sortedArray = sortArray(tobesorted);

        printArray(sortedArray);

        //        Unsoreted Array
        printArray(unsortedArray);


    }

    public static int[] sortArray(int [] inputArray){
        boolean fixed = false;
        while(fixed==false){
            fixed = true;
            int temp;
            for(int i = inputArray.length - 1 ; i > 0; i--){
                if (inputArray[i] > inputArray[i-1]){
                    temp = inputArray[i-1];
                    inputArray[i-1] = inputArray[i];
                    inputArray[i] = temp;
                    fixed = false;
                }
            }
        }
//        printArray(inputArray);
            return inputArray;
    }

    public static int[] getArray(int number){
        int [] inputArray = new int[number];
        System.out.println("Please enter elements:\r");
        for (int i = 0 ; i < inputArray.length ; i++){
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }


    public static void printArray(int[] valueArray){
        for (int i = 0 ; i < valueArray.length ; i++){
            System.out.println(valueArray[i]);
        }
    }
}
