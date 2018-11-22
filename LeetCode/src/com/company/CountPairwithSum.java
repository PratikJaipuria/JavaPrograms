package com.company;

import java.util.HashMap;

/**
 * Created by Pratik on 8/17/2017.
 */
public class CountPairwithSum {
    public int countPairwithGivenSum(int[] input, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = input.length;

        for(int i = 0 ; i < n ; i++){
            int key = input[i];
            if(!map.containsKey(key)){
                map.put(key,1);
            }else {
                map.put(key,map.get(key) + 1);
            }
        }
        int count = 0;
        for (int i = 0 ; i < n ; i++){

            if(map.containsKey(k - input[i])){
                count += map.get(k - input[i]);
                if(input[i] == k - input[i]){
                    count--;
                }
            }
        }
        return count/2;
    }
}
