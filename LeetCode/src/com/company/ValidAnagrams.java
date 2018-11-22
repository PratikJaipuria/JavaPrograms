package com.company;

import java.util.Arrays;

/**
 * Created by Pratik on 7/30/2017.
 */
public class ValidAnagrams {

    public boolean isAnagram(String s, String t) {


        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        if ( String.valueOf(sChar).equals(String.valueOf(tChar))){
            return true;
        }
        return false;



}
}
