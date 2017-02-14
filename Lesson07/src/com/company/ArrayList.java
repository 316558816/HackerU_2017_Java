package com.company;

import java.security.InvalidParameterException;
import java.security.SecureRandom;

/**
 * Created by hackeru on 2/14/2017.
 */
public class ArrayList implements List{

    private static int size;
    int[]arr;


    public ArrayList(){
        arr=new int[10];
        int size=0;//כמות האיברים

    }

    public ArrayList(int[] arr)

    {
        this.arr=arr;
        this.size=arr.length;
    }


    @Override
    public void add(int x) {
        if(size<arr.length){
        for (int i = 0; i <arr.length ; i++)
            arr[size] = x;
        }
        else
        {
         size=2*size;
         int []temp=new int[size];
            for (int i = 0; i <arr.length ; i++) {
                temp[i]=arr[i];
                this.arr=temp;
                size=i+1;
                temp[size]=x;


            }


        }

    }

    @Override
    public void add(int x, int index) {
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("the index not in the array");

        for (int i =size; i >=index ; i--)
            arr[i]=arr[i-1];
            arr[index]=x;
            size++;



        }



    @Override
    public void remove(int x, int index) {

        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("the index not in the array");

        for (int i = index; i <size-1 ; i++)
            arr[i]=arr[i+1];
            size--;



    }

    @Override
    public void set(int x, int index) {
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("the index not in the array");
        arr[index]=x;

    }

    @Override
    public int get(int index) {
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("the index not in the array");
          return arr[index];
    }

    @Override
    public int indexOf(int x) {
        for (int i = 0; i < size; i++) {

            if (arr[i] == x)
                return i ;


        }
        return -1;
    }


    @Override
    public int[] toArray() {
    int []arr2=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];

        }

        return arr2;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0)
            return "{}";
        String s = "{";
        for (int i = 0; i < size - 1; i++)
            s += arr[i] + ",";

        s += arr[size - 1];
        s += "}";
        return s;
    }
    }


