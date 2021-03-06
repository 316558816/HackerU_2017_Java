package com.company;

/**
 * Created by hackeru on 2/19/2017.
 */

public interface List<T> {

    void add(T x);
    void add(T x, int index);
    void remove(int index);
    void set(int index, T x);
    T get(int index);

    int indexOf(T x);
    T[] toArray();

    int size();
}