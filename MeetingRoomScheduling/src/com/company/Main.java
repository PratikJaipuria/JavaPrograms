package com.company;

import java.util.*;

public class Main {

    private static void main(String[] args) {
	// write your code here
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Activity act1 = new Activity(1,10);
        Activity act2 = new Activity(2,5);
        Activity act3 = new Activity(5,6);
        Activity act4 = new Activity(5,8);
        Activity act5 = new Activity(7,9);

//        System.out.println(act1.compareTo(act2.et));
        int[] sT = {1,2,5,5,7};
        int[] eT = {10,5,6,8,9};
        int count = 1;
        q.add(eT[0]);
        for(int i = 1 ; i < sT.length ; i++){
                if(q.peek() > sT[i]){
                    count++;
                }else{
                    q.poll();
                }
            q.add(eT[i]);
        }
//        q.add(10);
//        q.add(5);
//        q.add(6);
//        Iterator iter = q.iterator();
        System.out.println(count);



//        ArrayList<Integer> result = new ArrayList<>();
//        int count = 1;
//        result.add(0);
//        int currentActivity = 0;
//        for(int i=1; i < 5; i++){
//            if(sT[i] >= eT[currentActivity]){
//                result.add(i);
//                count++;
//                currentActivity = i;
//            }
//
//        }
//        for(int act : result){
//            System.out.println(act + " ");
//        }
//        System.out.println(count);
    }
}
