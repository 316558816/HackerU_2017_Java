package com.company;

import java.security.InvalidParameterException;

/**
 * Created by hackeru on 2/14/2017.
 */
public class LinkedList implements List {
    private Node anchor;
    private int size;

    public LinkedList() {
       anchor=new Node(123);
       size=0;
    }

    @Override
    public void add(int x) {
        Node n=anchor;
        while (n.next!=null)
        n=n.next;
        n.next=new Node(x);

      size++;


    }




        @Override
        public void add(int x, int index) {
            Node temp;
            if(index<0||index>size)
                throw new IndexOutOfBoundsException("not valid") ;
            Node n=anchor;
            for (int i = 0; i <index; i++) {
                n = n.next;
                size++;
            }
            temp = n.next;
            n.next=new Node(x);
            n.next=temp;

            size++;
        }




    @Override
    public void remove(int x, int index) {

        if(index<0||index>size)
            throw new IndexOutOfBoundsException("not valid") ;

        Node n=anchor;
        for (int i = 0; i <index ; i++) {
            n=n.next;
            n.next=n.next.next;
            size--;

        }
    }

    @Override
    public void set(int x, int index) {
        if(index<0||index>size)
            throw new IndexOutOfBoundsException("not valid") ;

        Node n=anchor;
        for (int i = 0; i <= index; i++) {
            n=n.next;
            n.value=x;


        }

    }

    @Override
    public int get(int index) {
        if(index<0||index>size)
            throw new IndexOutOfBoundsException("not valid") ;

        Node n=anchor;
        for (int i = 0; i <=index-1 ; i++)
            n=n.next;
            return n.value;

        }


    @Override
    public int indexOf(int x) {
        Node n = anchor.next;
        for (int i = 0; i < size; i++,n=n.next) {
            if (n.value == x)
                return i;
        }
        return -1;
    }



    @Override
    public int[] toArray() {
        Node n=anchor.next;
        int []arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=n.value;
            n=n.next;
        }

        return arr;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if(size==0)
            return "{}";
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("{");
        Node n=anchor.next;
        for (int i = 0; i < size - 1; i++,n=n.next) {
            stringBuilder.append(n.value + ",");
        }
        stringBuilder.append(n.value);
        stringBuilder.append("}");
        return stringBuilder.toString();

        }

    private static class Node{

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            next=null;


        }
    }


}
