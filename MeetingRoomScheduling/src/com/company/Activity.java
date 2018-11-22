package com.company;

/**
 * Created by Pratik on 10/31/2017.
 */
public class Activity implements Comparable<Integer> {

    int st;
    int et;

    public Activity(int st, int et) {
        this.st = st;
        this.et = et;
    }

    @Override
    public int compareTo(Integer o) {
        if(this.et > o){
            return et;
        }else {
            return o;
        }
    }
}
