package com.company;


import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void patternHelper(int[][] array){

        HashMap<Integer, StringBuilder> res = new HashMap<>();
        for(int i=0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                if(res.containsKey(i+j)){
                    res.put(i+j,res.get(i+j).append(Integer.toString(array[i][j])));
                }else{
                    res.put(i+j,new StringBuilder(Integer.toString(array[i][j])));
                }
            }

        }
        for(int i = 0 ; i <= 2 * (array[0].length - 1) ; i++){
            System.out.println(res.get(i));
        }
    }
    public static void main(String[] args) {
	// write your code here
//        int[][] array = new int[5][5];

        int array[][] = {{1,2,3,4,6},{5,4,3,5,7},{6,5,9,8,9},{9,8,7,6,1},{1,8,3,6,2}};
        patternHelper(array);
    }
}
