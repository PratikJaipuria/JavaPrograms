package com.company;

/**
 * Created by Pratik on 7/17/2017.
 */
public class TwoSum {

        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            int[] copy = new int[n];
            int[] ans = new int[2];

            for(int i = 0 ; i < n ; i++){
                copy[i] = target - nums[i];
            }

            for(int i = 0 ; i < n ; i++){
                for(int j = 1 ; j < n ; j++){

                    if (i != j){
                        if (nums[i] == copy[j]){
                            int[] arr =  {i,j};
                            return arr;

                            // if (i < j) {

                            // }else{
                            //   return {j,i};
                            // }
                        }

                    }
                }}

            return ans;
        }



    }

