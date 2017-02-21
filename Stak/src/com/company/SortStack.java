package com.company;

/**
 * Created by MyUser on 21/02/2017.
 */
public class SortStack <T> implements Comparable <T> {



     void sortStack(Stack stack) {
         // Integer num = new Integer(MIN_VALUE);
         Stack stack1 = new ArrStack();
         Stack stack2 = new ArrStack();
         // ministack1.push(num);

         stack1.push(stack.pop());
         while (!stack.isEmpty()) {
             SortStack o = (SortStack) stack.peek();
            SortStack o1 = (SortStack) stack1.peek();

         while (o.compareTo(o1)>0) )//implements compare to
             {
                 stack2.push(stack1.pop());
             }
         stack1.push(stack.pop());

         while (!stack2.isEmpty()) {
             stack1.push(stack2.pop());
         }

     }
         while (!stack1.isEmpty()) {
             System.out.println(stack1.pop());
         }
     }

    @Override
    public int compareTo(T o) {
        if(this>o)     //not possible > because this is SortStack how i need implement this?
            return 1;
        if(this.equals(0))
            return 0;
        return -1;

    }
}




