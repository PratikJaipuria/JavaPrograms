package com.company;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Pratik on 7/29/2017.
 */
public class GroupAnagrams {


//    public List<List<String>> groupAnagrams(String[] strs) {
//
//        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
//        Map<String, List<String>> map = new HashMap<String, List<String>>();
//        for (String s : strs) {
//            char[] ca = s.toCharArray();
//
//            Arrays.sort(ca);
//            System.out.println("1st"+ ca);
//            String keyStr = String.valueOf(ca);
//            System.out.println("2nd"+ keyStr);
//            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
//            map.get(keyStr).add(s);
//        }
//        return new ArrayList<List<String>>(map.values());
//    }
    private int getkeyofString(String s){
    int count = 0;
    for(int i = 0 ; i < s.length() ; i++){
        count += s.charAt(i) - 'a';
    }

    return count;
}
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for (int i = 0 ; i < strs.length ; i++){
            int key = getkeyofString(strs[i]);
            if(map.containsKey(key)){
                ArrayList<String> al = map.get(key);
                al.add(strs[i]);
                map.put(key, al);
            }else{
                ArrayList<String> a = new ArrayList<String>();
                a.add(strs[i]);
                map.put(key,a);

            }
        }
        List<List<String>> res = new ArrayList<>();

        for(ArrayList<String> val : map.values()){
            res.add(val);
        }
        return res;
    }
}