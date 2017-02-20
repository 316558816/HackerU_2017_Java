package com.company;

public class Main {

    public static void main(String[] args) {

        int [][]mat =   {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};


        sort(mat);


        }








    public static void sort(int[][] mat) {
        int j = 0;
        int[]arrresult=new int [mat.length*mat.length];
        int k=0;

        Element[] arr = new Element[mat.length];
        for (int i = 0; i < mat.length; i++) {
            arr[i]=new Element(mat[i][0],0,i);

        }


        Heap minheap=new Heap(arr);
        while (minheap.getSize()>0) {

            Element minelement=(Element) minheap.extractTop();
            if(minelement.row<mat[minelement.col].length-1)
            {
            arrresult[k++] = minelement.value;
            minheap.insert(mat[minelement.row][minelement.col + 1]);
        }


    }

        for (int i = 0; i < arrresult.length; i++) {
            System.out.println(arrresult[i]);
        }

        }

}
