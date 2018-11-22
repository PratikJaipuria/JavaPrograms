package com.company;

import java.util.HashMap;

/**
 * Created by Pratik on 9/27/2017.
 */
public class RomantoInt {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap();

        map.put('i', 1);
        map.put('v', 5);
        map.put('x', 10);
        map.put('l', 50);
        map.put('c', 100);
        map.put('d', 500);
        map.put('m', 1000);


        char[] sCh = s.toCharArray();
        int n = sCh.length - 1;
        int j = 0;
        int res = 0;
        int val;
        for(int i=n ; i > 0 ; i--){
            val = map.get(sCh[i]);
            res += val * Math.pow(10, j);
            j++;

        }

        return res;
    }
}
