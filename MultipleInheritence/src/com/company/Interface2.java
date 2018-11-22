package com.company;

/**
 * Created by Pratik on 10/17/2017.
 */
public interface Interface2 {
    void foo();

    default void show(){
        System.out.println("Inside Interface2 ");
    }
}
