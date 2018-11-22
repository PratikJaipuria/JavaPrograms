package com.company;


import java.util.HashMap;
import java.util.Random;

public class LoadBalancer {

    class Node{
        int server_id;
        Node next;
        Node prev;

        Node(int s, Node next, Node prev){
            this.server_id = s;
            this.next = next;
            this.prev = prev;
        }
    }
    HashMap<Integer,Node> map;
    Node head;
    Node cur;
    int size;

    public LoadBalancer() {
        // do intialization if necessary
        this.map = new HashMap();
        this.head = null;
        this.cur = this.head;
        this.size = 0;
    }

    /*
     * @param server_id: add a new server to the cluster
     * @return: nothing
     */
    public void add(int server_id) {
        // write your code here

        Node newNode = new Node(server_id, null,null);
        if(this.cur == null){

            //create new Node
            this.cur = newNode;
            map.put(server_id, this.cur);
            this.head = this.cur;
            this.size++;
            return;
        }

        this.cur.next = newNode;
        newNode.prev = this.cur;
        map.put(server_id, newNode);
        this.cur = newNode;
        size++;
        return;
    }

    /*
     * @param server_id: server_id remove a bad server from the cluster
     * @return: nothing
     */
    public void remove(int server_id) {
        // write your code here

        Node r = map.get(server_id);
        if(r.prev==null || r.next==null){
            if(r.prev==null){
                this.head = r.next;
            }

            r = null;
            map.remove(server_id);
            size--;

            return;
        }

        r.prev.next = r.next;
        r.next.prev = r.prev;
        r = null;
        map.remove(server_id);
        size--;
        return;
    }

    /*
     * @return: pick a server in the cluster randomly with equal probability
     */
    public int pick() {
        // write your code here
        Random rand = new Random();
        int  n = rand.nextInt(size) + 1;
        Node t = this.head;
        int i = 1;
        while(i < n){
            if(t!=null)
                t = t.next;
            i++;
        }

        return t.server_id;

    }
}