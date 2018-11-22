package com.company;

/**
 * Created by Pratik on 11/14/2017.
 */
public class DoublyLinkedList {
    int val;
    DoublyLinkedList prev;
    DoublyLinkedList next;
    DoublyLinkedList(int x) { val = x; }

    public int getVal() {
        return this.val;
    }
}
