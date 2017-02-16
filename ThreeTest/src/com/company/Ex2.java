package com.company;

/**
 * Created by hackeru on 2/16/2017.
 */
public class Ex2 {


    Node a;
    public Ex2(Node h)
    {
        a=h;

    }

  /*  static void insertionSort(int arr[]){
        for (int i = 1; i <arr.length ; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){//או שהגעתי לסוף המערך או שמצאתי איבר שיותר גדול מKEY
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }*/


 /* public Node insertSort(Node head)
  {



  }*/


    public Node bubbleSort(Node a) {

        Node anchor = new Node(0);

         Node b=a.next;

        Node temp = anchor;
        boolean isSorted = false;

        while (!isSorted) {


            isSorted = true;


            while (a.next != null) {

                if (a.value > b.value) {
                   /* temp = a;
                    a = b;
                    b = temp;*/
                   temp=a.next;

                   a.next=b.next;
                   b.next=temp;
                   temp=a.next;

                   isSorted=false;


                }
                temp = temp.next;
                a=a.next;


            }
            anchor=anchor.next;
        }
              return a;
    }
}