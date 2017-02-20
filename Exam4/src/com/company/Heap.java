package com.company;
import java.security.InvalidParameterException;

/**
 * Created by hackeru on 2/20/2017.
 */
public  class Heap {
    private Comparable[] arr;
    private int size;
    private boolean isMaxHeap;
    //if it isn't a max heap then it is a min heap

    public Heap(boolean isMaxHeap){
        arr = new Comparable[10];
        size = 0;
        this.isMaxHeap = isMaxHeap;
    }

    public Heap(Comparable[] arr){

        this.arr = arr;
        size = arr.length;
        for (int i = size/2; i >= 0; i--) {
            heapify(i);
        }

    }

    private boolean compare(int x, int y){
        if(isMaxHeap)
            return x > y;
        else
            return x < y;
    }

    private void heapify(int i){
        int largest = i;
        int l = leftChild(i);
        int r = rightChild(i);
        if(l<size && arr[l].compareTo(arr[largest])<=0)
            largest = l;
        if(r<size && (arr[r].compareTo(arr[largest])<=0))
            largest = r;
        if(largest != i){
            Comparable temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(largest);
        }
    }

    private void bubbleUp(int i){
        int p;
        while(i != 0 && (arr[i].compareTo( arr[(p=parent(i))])<=0))
        {
            Comparable temp = arr[i];
            arr[i] = arr[p];
            arr[p] = temp;
            i = p;
        }
    }


    private int leftChild(int i){
        return 2*i + 1;
    }

    private int rightChild(int i){
        return 2*i + 2;
    }

    private int parent(int i){
        return (i-1)/2;
    }


    public void insert(Comparable x){

        if(size == arr.length){
            Comparable[] temp = new Comparable[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];



            }
            arr = temp;
        }
        int i = size;
        size++;
        arr[i] = x;
        bubbleUp(i);
    }

    public Comparable getTop(){
        if(size == 0)
            throw new IndexOutOfBoundsException();

        Comparable result = arr[0];
        return result;
    }


    public Comparable extractTop(){
        if(size == 0)
            throw new IndexOutOfBoundsException();

        if(size == 1){
            size--;
            return arr[0];
        }
        Comparable max = arr[0];
        arr[0] = arr[size-1];
        size--;
        heapify(0);
        return max;
    }

    public int getSize(){
        return size;
    }
}