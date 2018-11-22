package com.company;

import java.util.*;

public class mostCommonWord {

    public String mostCommonWordApi(String paragraph, String[] banned) {

        HashSet<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> map = new HashMap<>();
        String res = "";
        List<String> results = new ArrayList<>();

        int maxVal = Integer.MIN_VALUE;
        String[] paraList = paragraph.split(" ");

        for(String word : paraList){
//             if(word.charAt(0) == ){
//                 word = word.substring(1);
//             }

            if(word.charAt(word.length()-1) == '\'' || word.charAt(word.length()-1) == '?' || word.charAt(word.length()-1) == '!'
                    || word.charAt(word.length()-1) == '.' || word.charAt(word.length()-1) == ';' || word.charAt(word.length()-1) == ','){
                word = word.substring(0,word.length()-1);
            }
            String w = word.toLowerCase();
            if(!bannedSet.contains(w)){

                if(map.containsKey(w))
                    map.put(w, map.get(w)+1);
                else
                    map.put(w,1);


                if(maxVal <= map.get(w)){

//                    res = w;
                    maxVal = map.get(w);
                    if(results.size() > 0 && map.get(results.get(0)) < maxVal){
                        results = new ArrayList<>();
                    }
                    results.add(w);
                    // System.out.println(maxVal + " " + res);
                }
            }
        }
        // System.out.println(map);
        for(String r : results){
            System.out.println(r);
        }
        return res;
    }
}
