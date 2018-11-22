package com.company;


import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Pratik on 7/12/2017.
 */
public class MinStackUsingStack {
    private Stack<Integer> stack;
    private Stack<Integer> aux;

    public MinStackUsingStack() {
        this.stack = new Stack<>();
        this.aux = new Stack<>();

    }

    public void push(int x) {
        this.stack.push(x);
        this.createMin(x);
    }

    public void pop() {
        int value = this.stack.pop();
        if(value == this.aux.peek())
        {this.aux.pop();}
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return this.aux.peek();

    }

    public void createMin(int x){
        if(this.aux.size() > 0){
            int value = this.aux.peek();
            int minValue = Math.min(value,x);
            this.aux.push(minValue);
        }
        else{
            this.aux.push(x);
        }
    }
}
