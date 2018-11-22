package com.company;

public class Main {

    public static void main(String[] args) {


//        MyLinkedList list = new MyLinkedList(null);
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "Darwin Brisbane PErth MElbourne Caneberra Adelaide Sydney Caneberra";
//        String stringData = "5 6 7 1 4 9 2 5 6";
        String[] data = stringData.split(" ");

        for (String s : data){
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("1"));
        tree.traverse(tree.getRoot());


    }
}
