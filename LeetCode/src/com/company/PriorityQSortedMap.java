package com.company;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQSortedMap {

    public PriorityQSortedMap(HashMap<Character, Integer> map){



        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>(){
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2){
                return o2.getKey().compareTo(o1.getKey());
            }
        });
    }
}
