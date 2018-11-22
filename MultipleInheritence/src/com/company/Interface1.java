package com.company;

/**
 * Created by Pratik on 10/17/2017.
 */
public interface Interface1 {
    void foo();
    default void show(){
        System.out.println("Inside Interface1 ");
    }
    static void sho(){
        System.out.println("No object needed");
    }
}
