package com.company;

/**
 * Created by Pratik on 7/22/2017.
 */
public class Node extends ListItem {
    public Node(Object value){
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightlink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightlink = item;
        return this.rightlink;
    }

    @Override
    ListItem previous() {
        return this.leftlink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftlink = item;
        return this.leftlink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null){
            return  ((String)super.getValue()).compareTo((String) item.getValue());
        }else {
            return -1;
        }
    }

}
