package com.company;

/**
 * Created by hackeru on 2/20/2017.
 */
public class Element implements Comparable<Element> {


    int value;
    int row;
    int col;

    public Element(int value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
    }

    @Override
    public int compareTo(Element o) {
        if(this.value>o.value)
            return 1;
        if(this.value==o.value)
            return 0;
        return -1;
    }
}
