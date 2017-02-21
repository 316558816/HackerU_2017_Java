package com.company;

/**
 * Created by MyUser on 21/02/2017.
 */
public class ArrStack<T> implements Stack<T> {

    public ArrStack(T[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    T [] arr;
   int size;

    public ArrStack() {

    }


    @Override
    public void push(T element) {

            makeRoom();
            arr[size++] = element;
        }

    private void makeRoom(){
        if(size == arr.length){
            T[] temp =  (T[])new Object[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            this.arr = temp;
        }
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





}


