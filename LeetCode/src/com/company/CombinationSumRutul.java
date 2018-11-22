package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pratik on 11/5/2017.
 */
public class CombinationSumRutul {
    public List<List<Integer>> combinationSum(int[] cands, int t) {
        boolean[][] res = new boolean[cands.length+1][t+1];
        res[0][0] = true;
        for(int i = 0 ; i <= cands.length ; i++){
            for(int j = 0 ; j <= t ; j++){
                if(j==0)
                    res[i][j]=true;
                else if(i==0)
                    res[i][j]=false;
                else
                {
                    res[i][j]=res[i-1][j];
                    if(j>=cands[i-1])
                    {
                        res[i][j] = res[i][j-cands[i-1]] || res[i][j];
                    }
                }
            }
        }

        for(int i = 0 ; i <= cands.length ; i++){
            for(int j = 0 ; j <= t ; j++) {
                System.out.print(res[i][j] + " " );
            }
            System.out.println();
        }
        ArrayList<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        recSol(res,cands,ans,temp,cands.length ,t);
//        for(List<Integer> l : ans){
            System.out.println("Solution " + ans);
//        }

                return new ArrayList<>();
    }

    public void recSol(boolean[][] res,int[] cands,  List<List<Integer>> ans ,List<Integer> temp, int i, int j){
        if(j == 0){
            List<Integer> n = new ArrayList<Integer>();
            n.addAll(temp);
            //.add(n);
            ans.add(n);
        }
        else if(i==0){
            return;
        }
        else if(res[i][j]) {
//            temp.add(cands[i - 1]);
            if(j >= cands[i-1] && res[i][j - cands[i-1]]){
                temp.add(cands[i-1]);
                recSol(res, cands, ans,temp, i, j - cands[i-1]);
                temp.remove(temp.size() -1);
            }
            if(res[i-1][j])
            recSol(res, cands, ans, temp, i - 1, j);
        }
        }


    }





