package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver);

    }

    public static void calculateScore(boolean gameOver){

        if(gameOver){
            System.out.println("The game is over");
        }
    }

}
