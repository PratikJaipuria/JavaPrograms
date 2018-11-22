package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SteadyGene {
    int steadyGene(String gene) {

        HashMap<Character,Integer> map = new HashMap();
        int s = gene.length();
        System.out.println(s);
        if(s>1500) return 0;
        int limit = s/4;
        map.put('A',0);
        map.put('C',0);
        map.put('G',0);
        map.put('T',0);
        int minLen = Integer.MAX_VALUE;

        for(char c : gene.toCharArray()){
            map.put(c, map.get(c) + 1);
        }

        int left = 0, right = 0;

        while (right <= s-1){

            char c = gene.charAt(right);
            map.put(c,map.get(c)-1);
            right++;
            while (isSteady(map,limit)){
                char l = gene.charAt(left);
                map.put(l,map.get(l)+1);
                minLen = Math.min(minLen, right-left);
                if (left < right)
                    left++;

            }

        }


        return minLen;

    }

    boolean isSteady(HashMap<Character,Integer> map, int limit){
        for(int v : map.values()){
            if(v > limit) return false;
        }
        return true;
    }

}
