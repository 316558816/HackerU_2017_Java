package com.company;

/**
 * Created by MyUser on 13/02/2017.
 */
public class Point {

    private  int x;
     private int y;
     Point p2;

    public Point(int x, int y, Point p2) {
        this.x = x;
        this.y = y;
        this.p2 = p2;
    }

    public Point() {

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }



    static  boolean isRight(int x, int y)
    {
        if(x>0)
        return true;
        return false;
    }


    static  boolean isLeft(int x,int y)
    {
        if(x<0)
        return true;
        return false;
    }
    static  boolean isAbove(int x, int y)
    {
       if(y>0)
           return true;
       return false;
    }

    static  boolean isUnder(int x, int y)
    { if(y<0)
        return true;
    return false;
    }

@Override
public boolean equals(Object obj) {
    if(obj == null)
        return false;
    if(obj == this)
        return true;
    if(obj instanceof Point){
        Point other = (Point)obj;
        return this.x == other.x && this.y == other.y;
    }
    return false;
}


 /*   public double distanceToPoint( int x,int y,Point p2){



}*/
}

