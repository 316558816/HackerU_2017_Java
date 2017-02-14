package com.company;

/**
 * Created by hackeru on 2/14/2017.
 */
public interface List {

    void add(int x);
    void add (int x, int index);
    void remove(int x, int index);
    void set (int x,int index);
    int get(int index);
    int indexOf (int x);
    int []toArray();
    int size();




}



