package com.company;

import java.util.ArrayList;

/**
 * Created by Pratik on 7/12/2017.
 */
public class MinStackUsingArrayList {

    /** initialize your da ta structure here. */

    private ArrayList<Integer> stack;
    private ArrayList<Integer> aux;

    public MinStackUsingArrayList() {
        this.stack = new ArrayList<Integer>();
        this.aux = new ArrayList<Integer>();

    }

    public void push(int x) {
        this.stack.add(x);
        this.createMin(x);
    }

    public void pop() {
        this.stack.remove(this.stack.size() -1 );
        this.aux.remove(this.aux.size() -1);
    }

    public int top() {
        return this.stack.get(this.stack.size() -1);
    }

    public int getMin() {
        return this.aux.get(this.aux.size() -1);

    }

    public void createMin(int x){
        if(this.aux.size() > 0){
            int value = this.aux.get(this.aux.size() -1);
            int minValue = Math.min(value,x);
            this.aux.add(minValue);
        }
        else{
            this.aux.add(x);
        }
    }
}
