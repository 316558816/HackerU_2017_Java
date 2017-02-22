package com.company;

import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidParameterException;

public class ArrStack<T> implements Stack<T> {


    T [] arr;
    int size;

    public ArrStack(T[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    public ArrStack() {

        this.arr = (T[]) new Object[10];
        this.size = 0;
    }


    @Override
    public void push(T element) {

        if(size == arr.length){
            T[] temp =  (T[])new Object[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            this.arr = temp;
        }
        arr[size++] = element;
    }




    @Override
    public T pop() {

        return   arr[size--];

    }

    @Override
    public boolean isEmpty() {

        if(size==0)
            return true;
        return false;
    }


    public T peek() {
        return arr[size-1];
    }

public static void sortStack(ArrStack<Comparable> stack)
{

    // Integer num = new Integer(MIN_VALUE);
    ArrStack<Comparable> stack1 = new ArrStack();
    ArrStack<Comparable> stack2 = new ArrStack();


    stack1.push(stack.pop());
    while (!stack.isEmpty()) {
        Comparable o =  stack.peek();
        Comparable o1 =  stack1.peek();

        while (o.compareTo(o1)>0) //implements compare to
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






}
