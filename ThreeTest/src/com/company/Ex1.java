package com.company;

import java.security.InvalidParameterException;

/**
 * Created by hackeru on 2/16/2017.
 */
public class Ex1 {

    private static int k=4;


    public static Node targil(NodeWithHead head) {

        Node a=head.value;
        Node b=head.next.value;



       // return head.value;
        if (a==null)
            throw new InvalidParameterException("not valid the list is empty");
        if (b==null) {
            return a;
        }

     while (head.value.next!=null) {
         while (head.value.next!=null&&head.next.next!=null)
         merge(a, b);
         merge(a,b.next);

     }
        return null;

    }


    public static Node taril1b(NodeWithHead head) {

        Node[] nodearr=new Node[k/2];      //מערך בגודל k/2
       int j=0;
       int cnt=0;
        Node anchor = head.value;
        Node one = null;
        Node two = null;
    Node b=head.next.next.value;


        while (head.next != null)
        {   cnt++;
            nodearr[j++] = merge(head.value,head.next.value); //merge
            head = head.next.next;

        }

        for (int i = 0; i < nodearr.length-1; i++) {

            merge(nodearr[j], nodearr[j+1]);
        }

        return head.value;
    }





    public static Node merge(Node a, Node b){

        Node anchor= new Node(123);//איבר פקטיבי לא משנה מה הערך שלו
        Node tail=anchor;
        while (true){
            if(a==null){
                tail.next=b;//אם אחת הרשימות הגיעה לקצה שלה אז משתמשים ברשימה השניה
                break;
            }else if (b==null){
                tail.next=a;
                break;
            }
            if(a.value<=b.value){
                tail.next=a;//טייל תמיד מצביע לאחרון
                a=a.next;
            }else {
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        return anchor.next;
    }

}











































