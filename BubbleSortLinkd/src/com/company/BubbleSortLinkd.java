package com.company;

/**
 * Created by MyUser on 16/02/2017.
 */
public class BubbleSortLinkd{



    public Node sort(Node a)  {
        Node anchor= new Node(0);
        Node temp = a;
        Node b = a.next;

        if (a.next == null)
            return a;
        while (b.next != null) {
            if (a.value > b.value) {
                temp.value = a.value;
                b.value = a.value;
                temp.value = b.value;
            }
            temp = temp.next;
            a = a.next;
            b = b.next;

        }
        return anchor.next;
    }

   /* public void add(int x) {
        Node i ;
        for ( i = anchor; i.next!=null; i=i.next);
        i.next=new Node(x);
        size++;
    }*/

    private static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            next = null;

        }

    }










}
