package com.company;

/**
 * Created by MyUser on 19/02/2017.
 */
public class ArrayList <T> implements List<T> {

    T [] arr;
    int  size;

    public ArrayList(){
        T arr  = (T) new Object[10];
        size = 0;
    }

    public ArrayList(T[] arr){
        this.arr = arr;
        this.size = arr.length;
    }


/*    public boolean add( User [] arr,User  userName) {
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].username.equals(userName))
                return false;
        }
        makeRoom();
        arr[size++] = userName;

        return  true;
    }*/

    private void makeRoom(){
        if(size == arr.length){
            T[] temp = (T[]) new Object[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            this.arr = temp;
        }
    }


  /*  public void add(T x, int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("what are you doing?");
        makeRoom();
        for (int i = size; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = x;
        size++;
    }*/


    @Override
    public void add(T x) {

    }

    @Override
    public void add(T x, int index) {

    }

    public void remove(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("what are you doing?");
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i+1];
        }
        size--;

    }


    public void set(int index, T x) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("what are you doing?");
        arr[index] = x;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("what are you doing?");
        return arr[index];
    }

    @Override
    public int indexOf(T x) {
        for (int i = 0; i < size; i++) {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        if(size == 0)
            return "{}";
        String s = "{";
        for (int i = 0; i < size - 1; i++) {
            s += arr[i] + ",";
        }
        s += arr[size - 1];
        s += "}";
        return s;
    }

    @Override
    public T[] toArray() {
        T[] temp = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    @Override
    public int size() {
        return size;
    }
}