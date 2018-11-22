package com.company;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player prat = new Player("Prat", 10 , 15);
        saveObject(prat);

        prat.setHitPoints(8);
        System.out.println(prat);
        prat.setWeapon("Strombringer");
        saveObject(prat);
//        loadObject(prat);
        System.out.println(prat);


        ISaveable werewolf = new Monster("Werewolf",40,20);
        System.out.println("Monster Stregth  "+((Monster)werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);


    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit =false;
        int index = 0;
        System.out.println("Choose \n" +
                "1 to enter a string\n" +
                "2 to quit");

        while (!quit){
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
            }

        }
        return values;
    }


    public static void saveObject(ISaveable objectToSave){
        for (int i = 0 ; i< objectToSave.write().size() ; i++){
            System.out.println("Saving " + objectToSave.write().get(i) + "to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
