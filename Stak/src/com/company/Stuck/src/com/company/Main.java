package com.company;

public class Main {

    public static void main(String[] args) {


        ArrStack<Comparable> s = new ArrStack<>();
        s.push(5);
        s.push(7);
        s.push(3);
        s.push(10);




        ArrStack.sortStack(s);




    }

    public static void reverse(Stack stack)
    {
        Stack stack1=new ArrStack();
        while (!stack.isEmpty())
        {
            stack1.push(stack.pop());

        }
        Stack stack2=new ArrStack();
        while(!stack2.isEmpty())
        {
            stack.push(stack2.pop());

        }


    }


}





