package com.company;

/**
 * Created by Pratik on 8/1/2017.
 */

import java.util.HashMap;
public class TwoSumSortedArray {

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i=0 ; i < numbers.length ; i++){
            if(hmap.containsKey(numbers[i])){
                return new int[]{hmap.get(numbers[i]), i+1};
            }else{

                hmap.put(target - numbers[i],i+1);
            }
        }
        return new int[]{0,0};
    }
}
