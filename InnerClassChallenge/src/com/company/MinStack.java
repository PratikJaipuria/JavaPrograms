package com.company;

import java.util.ArrayList;

/**
 * Created by Pratik on 7/12/2017.
 */
public class MinStack {

    private ArrayList<Integer> stack;
    private ArrayList<Integer> aux;
    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new ArrayList<Integer>();
        this.aux = new ArrayList<Integer>();

    }

    public void push(int x) {
        this.stack.add(x);
        this.createMin(x);
    }

    public void pop() {
        this.stack.remove(this.stack.size() -1 );
    }

    public int top() {
        return this.stack.get(this.stack.size() -1);
    }

    public int getMin() {
        return this.aux.get(this.aux.size() -1);

    }

    public void createMin(int x){
        int value = this.aux.get(this.stack.size() -1);
        int minValue = Math.min(value,x);
        this.aux.add(minValue);
    }
}

