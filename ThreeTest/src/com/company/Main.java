package com.company;


public class Main {




    public static void main(String[] args) {
     Node h=null;


        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        Node n5 = new Node(9);

        h=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        Ex2 e=new Ex2(h);

        e.bubbleSort(h);
    /*    Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        Node n5 = new Node(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n4.next = n5;
        NodeWithHead h1 = new NodeWithHead(n1);
        Node n6 = new Node(1);
        Node n7 = new Node(3);
        Node n8 = new Node(6);
        Node n9 = new Node(7);
        Node n10 = new Node(10);

        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;

        NodeWithHead h2 = new NodeWithHead(n6);
        Node n11 = new Node(8);
        Node n12 = new Node(10);
        Node n13 = new Node(12);
        Node n14 = new Node(14);
        Node n15 = new Node(16);

        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;
        NodeWithHead h3 = new NodeWithHead(n11);


        h1.next = h2;
        h2.next=h3;

        Node first=h1.value;

     *//*  Node end= Ex1.targil(h1);

        while (end.next!=null)
            System.out.println(end.value);
*//*
      Ex2 e=new Ex2();
      e.bubbleSort(n1);*/
    }
}
