package com.company;

import java.util.HashMap;

/**
 * Created by Pratik on 7/26/2017.
 */
public class HasUniqueChar {
    String s = "abcdzz";

    public Boolean checkUnique(String s){
        HashMap<Character, Boolean> hmap = new HashMap<Character, Boolean>();
        int n = s.length();
        for (int i=0 ; i < n ; i++){
            char c = s.charAt(i);
            if (hmap.containsKey(c)){
                return false;
            }else {
                hmap.put(c,false);
            }

        }
        return true;
    }


}
