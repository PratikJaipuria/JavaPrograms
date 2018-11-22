package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pratik on 11/4/2017.
 */
public class Subset {

    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        rec(res,tmp,nums,0, 7);

        return res;
    }

    private void rec(List<List<Integer>> res, ArrayList<Integer> tmp, int[] nums, int start, int target){
        int sum = 0;
        for(int val : tmp){
            sum+=val;
        }
        if(sum == target){
            res.add(tmp);
            System.out.println(tmp);
        }

        for(int i = start; i < nums.length; i++){
            tmp.add(nums[i]);
            rec(res,tmp,nums, i+1,target);
            tmp.remove(tmp.size()-1);
        }

    }
}
